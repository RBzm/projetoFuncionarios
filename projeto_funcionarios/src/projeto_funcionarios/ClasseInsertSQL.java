package projeto_funcionarios;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ClasseInsertSQL {

	public void salvarDados(ClasseFuncionarios funcionario) {

		String insert_sql = "INSERT INTO tabela_funcionarios VALUES(default, ?, ?)";

		Connection acesso = null; // import java.sql

		PreparedStatement preparar = null; // import java.sql

		try

		{

			acesso = ClasseDadosConexão.criarConexao();// Juntar dados do banco com o comando sql insert

			preparar = acesso.prepareStatement(insert_sql);

			preparar.setString(1, funcionario.getAtributoNomeFuncionario());

			preparar.setDouble(2, funcionario.getAtributoRendaFuncionario());

			preparar.execute();

		} catch (Exception e) {

			System.out.println("Erro ao acessar o banco!" + e);

		}

		finally {

			try {

				if (preparar != null) {

					preparar.close();

				}

				if (acesso != null) {

					acesso.close();

				}

			} catch (Exception e) {

				System.out.println();

			}

		}

	}
}
