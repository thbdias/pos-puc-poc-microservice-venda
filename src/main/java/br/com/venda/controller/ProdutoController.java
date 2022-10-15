package br.com.venda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.venda.dto.ProdutoDTO;
import br.com.venda.service.ProdutoService;

@RestController
@RequestMapping
public class ProdutoController {
	
	@Autowired
	private ProdutoService produtoService;
	
	@PostMapping("/inserir/produto")
	public ProdutoDTO saveProduto(@RequestBody ProdutoDTO produtoDTO) {
		return produtoService.save(produtoDTO);
	}

}
