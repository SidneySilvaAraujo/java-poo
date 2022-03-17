//Gerente erda de Funcionario;
public class Gerente extends Funcionario {
	private int senha;
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	public void setCenha(int cenha) {
		this.senha = cenha;
	}

	/*public double getBonificacao() {
		return this.salario;
	}*/
	
}
