package projeto_funcionarios;

public class ClasseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClasseFuncionarios funcionario = new ClasseFuncionarios();
		//pessoa.setAtributoIdPessoa(1);
		funcionario.setAtributoNomeFuncionario("leandro");
		funcionario.setAtributoRendaFuncionario(50);
		
		ClasseInsertSQL sql = new ClasseInsertSQL();
		sql.salvarDados(funcionario);
		
	}

}
