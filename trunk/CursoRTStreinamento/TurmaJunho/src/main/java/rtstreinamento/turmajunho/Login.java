package rtstreinamento.turmajunho;


public class Login {
	
	public boolean autenticar(String usuario, String senha) {
		if (usuario == null) return false;
		
		if (senha == null) return false;
		
		if (senha.length() < 8 || senha.length() > 10) return false;
		
		if (! usuario.equals("joao@gmail.com")) return false;
		
		if (! senha.equals("12345678")) return false;
		
		return true;
	}

}
