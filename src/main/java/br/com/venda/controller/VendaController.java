package br.com.venda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
	public String inserirVenda(@RequestBody VendaDTO vendaDTO) {
		return vendaService.inserirVenda(vendaDTO);
	}
	
	@GetMapping("/obter/vendas")
	public List<VendaDTO> obterVendas() {
		return vendaService.obterVendas();
	}

}
