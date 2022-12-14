package br.com.venda.dto;

import lombok.Data;

@Data
public class VendaDTO {
	
	private Long idProduto;
	
	private Long idNotaFiscalProdutor;
	
	private Integer quantidade;
	
	private Integer numTransf;
	
	private String nomeMotoristaLocal;

}
