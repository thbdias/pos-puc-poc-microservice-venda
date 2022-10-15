package br.com.venda.util;

import org.modelmapper.ModelMapper;

import br.com.venda.domain.Venda;
import br.com.venda.dto.VendaDTO;


public class VendaAdapter {
	
	private static ModelMapper mapper = new ModelMapper();
	
	public static Venda adapt (VendaDTO vendaDTO) {
		return mapper.map(vendaDTO, Venda.class);
	}

	public static VendaDTO adapt (Venda venda) {
		return mapper.map(venda, VendaDTO.class);
	}
}
