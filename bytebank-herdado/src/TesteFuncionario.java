
public class TesteFuncionario {
	public static void main(String[] args) {
		Funcionario sidney = new Funcionario();
		sidney.setNome("Sidney Araujo");
		sidney.setCpf("777.777.777-77");
		sidney.setSalario(10000.0);
		System.out.println("Nome: " + sidney.getNome() + " bonificação: " + sidney.getBonificacao());
	}
}
