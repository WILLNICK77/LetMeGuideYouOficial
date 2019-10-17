package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {

	Connection conexao;
	
	

	public Conexao() {

		try {
			
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			
			e.printStackTrace();
			
		}
	
	}
	
	
	
	public Connection getConexao() {
			if (conexao == null)
				try {
					conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/pji?user=root&password=");
				} catch (SQLException e) {
					System.out.println("Connection error: " + e.getMessage());
				}
			return conexao;
			
		}
	


	public void setConexao(Connection conexao) {
		this.conexao = conexao;
	}
	
	
	
}


