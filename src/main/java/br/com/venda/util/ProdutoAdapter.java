package br.com.venda.util;

import org.modelmapper.ModelMapper;

import br.com.venda.domain.Produto;
import br.com.venda.dto.ProdutoDTO;


public class ProdutoAdapter {
	
	private static ModelMapper mapper = new ModelMapper();
	
	public static Produto adapt (ProdutoDTO produtoDTO) {
		return mapper.map(produtoDTO, Produto.class);
	}

	public static ProdutoDTO adapt (Produto produto) {
		return mapper.map(produto, ProdutoDTO.class);
	}
}
