package br.com.venda.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import br.com.venda.dto.NotaFiscalDTO;
import br.com.venda.dto.UpdateSaldoPesoDTO;



@FeignClient(name = "produtor-service-client", url = "${produtor.service.host.api}")
public interface ProdutorClient {		

	@PostMapping("/update/saldo/peso")
	String upateSaldoPeso(UpdateSaldoPesoDTO updateSaldoPesoDTO);	

}
