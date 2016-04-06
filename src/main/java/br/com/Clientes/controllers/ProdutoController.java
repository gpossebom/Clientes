package br.com.Clientes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.Clientes.models.Produto;
import br.com.Clientes.models.ProdutoManager;

@Controller
public class ProdutoController {

	@Autowired
	private ProdutoManager produtoManager;
	
	@RequestMapping("/produtos")
	public String todos(Model model)
	{
		model.addAttribute("produtos",
				produtoManager.obterTodos());
		return "produtos";
	}
	
	@RequestMapping("/detalhe")
	public String detalhe(@PathVariable("id") long id, Model model)
	{
		Produto produto;
		produto = produtoManager.obterPorId(id);
		model.addAttribute("produto", produto);
		return "produto-detalhe";
	}
	
}
