package br.com.venda.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.venda.dto.EmbalagemDTO;

@RestController
@RequestMapping
public class EmbalagemController {
	
	@PostMapping("/inserir/registro")
	public String inserirRegistro(@RequestBody EmbalagemDTO embalagemDTO) {
		return embalagemDTO.getQuantidade() + "";
	}

}
