package br.com.venda.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.venda.domain.Produto;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Long> {

}
