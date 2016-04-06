package br.com.Clientes.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Primary
@Repository
public class JDBCClienteRepository implements ClienteRepository {

	public JDBCClienteRepository() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	private ConexaoBD conexaoBd;
	
	@Override
	public void inserir(Cliente cliente) {
		Connection con;
		con = conexaoBd.obterConexao();
		
		String sql = "INSERT INTO clientes " +
					"(Nome, CPF, DataNascimento," +
					"Sexo, Senha, Ofertas" +
					"VALUES (?,?,?,?,PASSWORD(?),?)";
		
		PreparedStatement ps;
		try{
			ps = con.prepareStatement(sql);
			ps.setString(1, cliente.getNome());
			ps.setLong(2, cliente.getCpf());
			ps.setDate(3, new java.sql.Date(cliente.getDataNascimento().getTime()));
			ps.setString(4, cliente.getSexo());
			ps.setString(5, cliente.getSenha());
			ps.setBoolean(6, cliente.getReceberOfertaPorEmail());
		} catch(SQLException e) {
			throw new RuntimeException ("Ocorreu um erro ao inserir um cliente: " + e.getMessage());
		}
		
		
	}

}
