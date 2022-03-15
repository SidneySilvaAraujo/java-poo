package bytbank;

public class CriaConta {
	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 100.0;
		contaDoPaulo.deposita(50);
		System.out.println(contaDoPaulo.saldo); //imprime;
		contaDoPaulo.saca(20); //chama outro método, e saca uma quantidade;
		System.out.println(contaDoPaulo.saldo); //imprime;
		
	}
}
