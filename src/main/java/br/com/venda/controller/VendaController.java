package br.com.venda.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.venda.dto.VendaDTO;

@RestController
@RequestMapping
public class VendaController {
	
	@PostMapping("/inserir/registro")
	public String inserirRegistro(@RequestBody VendaDTO embalagemDTO) {
		return embalagemDTO.getQuantidade() + "";
	}

}
