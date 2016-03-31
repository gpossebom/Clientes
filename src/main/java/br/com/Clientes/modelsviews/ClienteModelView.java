package br.com.Clientes.modelsviews;

import br.com.Clientes.models.Cliente;

public class ClienteModelView {

	private Cliente cliente;
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getConfirmacaoSenha() {
		return confirmacaoSenha;
	}

	public void setConfirmacaoSenha(String confirmacaoSenha) {
		this.confirmacaoSenha = confirmacaoSenha;
	}

	private String confirmacaoSenha;
	
	public ClienteModelView() {
		// TODO Auto-generated constructor stub
	}

}
