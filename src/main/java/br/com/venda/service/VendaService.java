package br.com.venda.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.venda.client.NotaFiscalClient;
import br.com.venda.domain.Venda;
import br.com.venda.dto.NotaFiscalDTO;
import br.com.venda.dto.VendaDTO;
import br.com.venda.repository.VendaRepository;
import br.com.venda.util.VendaAdapter;

@Service
public class VendaService {
	
	@Autowired
	private VendaRepository vendaRepository;
	
	@Autowired
	private NotaFiscalClient notaFiscalClient;
	
	public VendaDTO inserirVenda(VendaDTO vendaDTO) {
		
//		VendaDTO vendaSalva = saveVenda(vendaDTO);
		
		//chamar nfe
		NotaFiscalDTO nfe = new NotaFiscalDTO();
		nfe.setNomeProduto("manga");
		nfe.setQuantidade(12);
		notaFiscalClient.emitirNfe(nfe);
		
//		return vendaSalva;
		return null;
		
	}
	
	
	private VendaDTO saveVenda(VendaDTO vendaDTO) {
		
		Venda venda = VendaAdapter.adapt(vendaDTO);
		venda.setCreateAt(LocalDate.now());
		
		return VendaAdapter.adapt(vendaRepository.save(venda));
	}

}
