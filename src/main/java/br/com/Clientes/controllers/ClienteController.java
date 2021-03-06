package br.com.Clientes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.Clientes.models.ClienteService;
import br.com.Clientes.modelsviews.ClienteModelView;

@Controller
public class ClienteController {

	
	@Autowired
	private ClienteService clienteService;
	
	@RequestMapping(value="/clientes/novo",
					method=RequestMethod.POST)
	
	public String cadastrar (ClienteModelView clientemv,
							 BindingResult bindingResult)
	{
		clienteService.cadastrar(clientemv.getCliente());
		return "redirect:/clientes/novo-sucesso";
	}
	
	@RequestMapping("/clientes/novo-sucesso")
	public String novoSucesso()
	{
		return "cliente-novo-sucesso";
	}
	
	
	@RequestMapping(value="/clientes/novo",
					method=RequestMethod.GET)
	
	public String novo(Model model)
	{
		model.addAttribute("clientemv",
							new ClienteModelView());
		return "cliente-novo";
	}
	
	public ClienteController() {
		// TODO Auto-generated constructor stub
	}

}
