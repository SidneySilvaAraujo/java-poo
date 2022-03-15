package bytbank;

public class CriaConta {
	public static void main(String[] args) {
			Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200.0;
		//definindo ooutra conta;
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50.0;
		System.out.println("A primeira conta tem: " + primeiraConta.saldo + " e, a segunda conta tem: " + segundaConta.saldo);
	}
}
