package br.com.Clientes.models;

import java.util.List;

public interface ProdutoRepository {
	List<Produto> obterTodos();
	Produto obterPorId(long id);
}
