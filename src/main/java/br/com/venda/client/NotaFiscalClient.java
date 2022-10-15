package br.com.venda.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.venda.dto.NotaFiscalDTO;



@FeignClient(name = "nota-service-client", url = "${nota.service.host.api}")
public interface NotaFiscalClient {		

	@PostMapping("/emitir")
	String emitirNfe(NotaFiscalDTO notaFiscalDTO);	

}
