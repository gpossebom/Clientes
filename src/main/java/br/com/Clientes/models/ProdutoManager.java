package br.com.Clientes.models;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public interface ProdutoManager {

	List<Produto> obterTodos();
	Produto obterPorId(long id);
	
}
