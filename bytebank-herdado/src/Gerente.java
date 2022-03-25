

public class Gerente extends Funcionario implements Autenticavel {
	private Autenticacao util;
	public Gerente() {
		this.util = new Autenticacao();
	}
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do GERENTE");
		return super.getSalario();
	}

	@Override
    public void setSenha(int senha){
        this.util.autentica(senha);
    }

    @Override
    public boolean autentica(int senha){
    	return this.util.autentica(senha);
    }

}
