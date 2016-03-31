package br.com.Clientes.models;

import org.springframework.beans.factory.annotation.Autowired;

public class ClienteServiceImpl implements ClienteService {

	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public ClienteServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void cadastrar(Cliente c) {
		clienteRepository.inserir(c);

	}

}
