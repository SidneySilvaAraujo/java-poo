package bytbank;

public class Conta {
	int numero;
	double saldo;
	int agencia;
	String titular;
	//metodos;
	public void deposita (double valor) {
		saldo = saldo + valor;
 	}
	
	public boolean saca(double valor) {
		if (this.saldo>= valor) {
			this.saldo = this.saldo - valor;
			return true;
		} else {
			return false;
		}
		
	}
}
