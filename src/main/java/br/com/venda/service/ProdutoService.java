package br.com.venda.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.venda.domain.Produto;
import br.com.venda.dto.ProdutoDTO;
import br.com.venda.repository.ProdutoRepository;
import br.com.venda.util.ProdutoAdapter;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	public ProdutoDTO save(ProdutoDTO produtoDTO) {
		
		Produto produto = ProdutoAdapter.adapt(produtoDTO);
		produto.setCreateAt(LocalDate.now());
		
		return ProdutoAdapter.adapt(produtoRepository.save(produto));
	}

}
