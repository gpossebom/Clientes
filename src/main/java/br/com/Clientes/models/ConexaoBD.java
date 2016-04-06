package br.com.Clientes.models;

import java.sql.DriverManager;

import org.springframework.stereotype.Component;

import com.mysql.jdbc.Connection;

@Component
public class ConexaoBD {

	private final static String CONNECTION_STRING =
			"jdbc:mysql://localhost/lojajdbc?user=root&password=";
	
	
	static{
		try{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		}
		catch(InstantiationException |
				IllegalAccessException |
				ClassNotFoundException e){
			throw new RuntimeException("Não foi possível carregar o driver do MYSQL" + e.getMessage());
		}
	}
	
	public Connection obterConexao()
	{
		try{
			return (Connection) DriverManager.getConnection(CONNECTION_STRING);
		}
		catch(Exception e)
		{
			throw new RuntimeException("Não foi possível obter uma conexão com MySQL" + e.getMessage());
		}
	}
	public ConexaoBD() {
		// TODO Auto-generated constructor stub
	}

}
