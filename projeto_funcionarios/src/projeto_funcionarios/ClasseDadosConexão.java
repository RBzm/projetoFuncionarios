package projeto_funcionarios;

import java.sql.Connection;
import java.sql.DriverManager;

public class ClasseDadosConexão {
	
	private static final String USERNAME = "root";
	private static final String PASSWORD = "etec"; 
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/banco_funcionarios";
	
	public static Connection criarConexao() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conexao = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
		return conexao;
		
	}
	
	public static void main(String[] args) throws Exception {
		
		Connection con = criarConexao();
		if(con != null) {
			System.out.println("conexao ok");
			con.close();
			
		}
		
	}

	

}