package br.com.venda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.venda.dto.VendaDTO;
import br.com.venda.service.VendaService;

@RestController
@RequestMapping
public class VendaController {
	
	@Autowired
	private VendaService vendaService;
	
	@PostMapping("/inserir/venda")
	public VendaDTO inserirVenda(@RequestBody VendaDTO vendaDTO) {
		return vendaService.inserirVenda(vendaDTO);
	}

}
