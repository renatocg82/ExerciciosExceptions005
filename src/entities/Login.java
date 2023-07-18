package entities;

public class Login {
	
	protected String usuario;
	protected String senha;
	
	public Login() {
		
	}

	public Login(String usuario, String senha) {
		this.usuario = usuario;
		this.senha = senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getUsuario() {
		return this.usuario;
	}
	
	public boolean fazerLogin(String usuario, String senha) {
		
		boolean fz = false;
		try {
			
			if (!this.usuario.equals(usuario) ) {
				throw new Exception ("Usuario incorreto");
			}
			if (!this.senha.equals(senha)) {
				throw new Exception ("Senha incorreta");
			}
			
			if ((this.usuario.equals(usuario)) && (this.senha.equals(senha))) {
				System.out.println("You Logged in.");
				fz = true;
			}
			
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
			fz = false;
		}

		return fz;	
	}
	
}
