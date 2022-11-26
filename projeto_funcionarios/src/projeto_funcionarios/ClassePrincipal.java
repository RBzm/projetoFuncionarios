package projeto_funcionarios;

public class ClassePrincipal {
	
	public static void name(String[] args) {
		ClasseFuncionarios funcionario = new ClasseFuncionarios();
		//pessoa.setAtributoIdPessoa(1);
		funcionario.setAtributoNomeFuncionario("rafa");
		funcionario.setAtributoRendaFuncionario(10);
		
		ClasseInsertSQL sql = new ClasseInsertSQL();
		sql.salvarDados(funcionario);

		
	}
	
}
