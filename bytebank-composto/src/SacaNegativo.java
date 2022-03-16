//teste de saque negativo;

public class SacaNegativo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		double sacar = 200.0;
		conta.setSaldo(conta.deposita(100.0));
		System.out.println("O saldo é: " + conta.getSaldo());
		if (conta.saca(sacar) == false) {
		System.out.println("Impocível sacar " + sacar);	
		}
		
	}
}
