
public class TestaBanco {
	public static void main(String[] args) {
		Cliente sidney = new Cliente();
		sidney.nome = "Sidney Silva Araujo Silverio";
		sidney.cpf = "777.777.777-77";
		sidney.proficao = "analista de gestão de ti jr";
		Conta contaDoSidney = new Conta();
		contaDoSidney.saldo = 10000;
		contaDoSidney.titular = sidney;
		System.out.println(contaDoSidney.titular.nome);
	}
}
