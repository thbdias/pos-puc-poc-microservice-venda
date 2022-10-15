package br.com.venda.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.venda.domain.Venda;

@Repository
public interface VendaRepository extends CrudRepository<Venda, Long> {
	
	List<Venda> findAll();

}
