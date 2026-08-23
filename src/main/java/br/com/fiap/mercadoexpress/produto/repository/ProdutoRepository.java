package br.com.fiap.mercadoexpress.produto.repository;

import br.com.fiap.mercadoexpress.produto.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
