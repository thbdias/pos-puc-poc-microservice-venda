package br.com.venda.dto;

import lombok.Data;

@Data
public class VendaDTO {
	
	private Integer idProduto;
	
	private Integer quantidade;
	
	private Integer numTransf;
	
	private String nomeMotoristaLocal;

}
