package br.com.venda.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.venda.client.NotaFiscalClient;
import br.com.venda.client.ProdutorClient;
import br.com.venda.domain.Venda;
import br.com.venda.dto.NotaFiscalDTO;
import br.com.venda.dto.ProdutoDTO;
import br.com.venda.dto.UpdateSaldoPesoDTO;
import br.com.venda.dto.VendaDTO;
import br.com.venda.repository.VendaRepository;
import br.com.venda.util.VendaAdapter;

@Service
public class VendaService {
	
	@Autowired
	private VendaRepository vendaRepository;
	
	@Autowired
	private NotaFiscalClient notaFiscalClient;
	
	@Autowired
	private ProdutorClient produtorClient;
	
	@Autowired
	private ProdutoService produtoService;
	
	
	
	public String inserirVenda(VendaDTO vendaDTO) {
		
		VendaDTO vendaSalva = saveVenda(vendaDTO);		
		
		ProdutoDTO produtoDTO = produtoService.getById(vendaDTO.getIdProduto());
		
		NotaFiscalDTO nfe = new NotaFiscalDTO();
		nfe.setNomeProduto(produtoDTO.getNome());
		nfe.setQuantidade(vendaDTO.getQuantidade());
		String obsNfe = notaFiscalClient.emitirNfe(nfe);
		
		UpdateSaldoPesoDTO updateSaldoPesoDTO = new UpdateSaldoPesoDTO();
		updateSaldoPesoDTO.setIdNotaFiscalProdutor(vendaDTO.getIdNotaFiscalProdutor());
		updateSaldoPesoDTO.setQuantidade(vendaDTO.getQuantidade());
		String obsUpdateQuantidade = produtorClient.upateSaldoPeso(updateSaldoPesoDTO);
		
		return "Venda salva - [" + obsNfe + "]";
	}
	
	
	private VendaDTO saveVenda(VendaDTO vendaDTO) {
		
		Venda venda = VendaAdapter.adapt(vendaDTO);
		venda.setCreateAt(LocalDate.now());
		
		return VendaAdapter.adapt(vendaRepository.save(venda));
	}


	public List<VendaDTO> obterVendas() {
		List<VendaDTO> listaRetorno = new ArrayList<>();
		
		List<Venda> all = vendaRepository.findAll();
		
		all.stream().forEach(v -> listaRetorno.add(VendaAdapter.adapt(v)));
		
		return listaRetorno;
	}

}
