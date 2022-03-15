package exercicioaluno.interfaces;

public interface PermitirAcesso {
	
	public boolean autenticar();
	
	public boolean autenticar(String login, String senha);
	
}
