
public class TesteGerente {
	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Sidney Araujo");
		g1.setCpf("777.777.777-77");
		g1.setSalario(20000.0);
		System.out.println("Gerente: " + g1.getNome() + " salário: " + g1.getSalario() + " cpf: " + g1.getCpf());
		g1.setCenha(2022);
		boolean altenticou = g1.autentica(2022); 
		System.out.println(altenticou);
	}
}
