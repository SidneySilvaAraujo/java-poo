
public class TesteSistema {

	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setSenha(7777);
		
		Administrador adm = new Administrador();
		adm.setSenha(7777);
		
		Cliente cliente = new Cliente();
		cliente.setSenha(7777);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		si.autentica(adm);
		si.autentica(cliente);


	}

}
