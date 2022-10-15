package br.com.venda.domain;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Venda {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	private Long idProduto;
	
	private Integer quantidade;
	
	private Integer numTransf;
	
	private String nomeMotoristaLocal;
	
	private LocalDate createAt;

}
