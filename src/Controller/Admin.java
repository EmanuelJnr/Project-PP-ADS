package Controller;

public class Admin {
	private String email;
	private String senha;

	public Admin(String email, String senha) {
		setEmail(email);
		setSenha(senha);
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
}