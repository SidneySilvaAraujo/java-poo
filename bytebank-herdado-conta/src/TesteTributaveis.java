
public class TesteTributaveis {
	public static void main(String[] args) {
		Conta cc = new ContaCorrente(1234, 333);
		SeguroDeVida seguro = new SeguroDeVida();
		CalculadorDeImposto cal = new CalculadorDeImposto();
		cal.registra(seguro);
		System.out.println(cal.getTotalImposto());
	}
}
