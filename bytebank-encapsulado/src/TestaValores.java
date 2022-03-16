
public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(1234, 122132);
		Conta conta2 = new Conta(4321, 20221);
		Conta conta3 = new Conta(5678, 3041);
		System.out.println("O total de contas é: " + Conta.getTotal());
		
	}
}
