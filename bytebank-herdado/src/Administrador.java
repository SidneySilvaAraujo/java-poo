
public class Administrador extends Funcionario implements Autenticavel {
	private Autenticacao util;

	public Administrador() {
		this.util = new Autenticacao();
	}

	@Override
	public double getBonificacao() {
		return 50;
	}

	@Override
	public void setSenha(int senha) {
		this.util.autentica(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.util.autentica(senha);
	}

}
