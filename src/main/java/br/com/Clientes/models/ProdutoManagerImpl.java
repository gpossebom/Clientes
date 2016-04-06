package br.com.Clientes.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ProdutoManagerImpl implements ProdutoManager {
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Override
	public List<Produto> obterTodos() {
		// TODO Auto-generated method stub
		return produtoRepository.obterTodos();
	}

	@Override
	public Produto obterPorId(long id) {
		// TODO Auto-generated method stub
		return produtoRepository.obterPorId(id);
	}

}
