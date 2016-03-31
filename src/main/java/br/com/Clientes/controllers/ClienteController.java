package br.com.Clientes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.Clientes.modelsviews.ClienteModelView;

@Controller
public class ClienteController {

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
