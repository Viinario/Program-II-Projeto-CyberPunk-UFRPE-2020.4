package pessoa;

public abstract class Pessoa {
	private String nome;
	private String login;
	private String senha;
	//
	public Pessoa(String nome,String login,  String senha)  {
		this.setNome(nome);
		this.setLogin(login);
		this.setSenha(senha);
	}
	@Override
	public  String toString() {
		return String.format("\nNome: %s \nLogin: %s  \nSenha: %s",getNome(), getLogin(), getSenha());
	}
	@Override
	public boolean equals(Object obj) {
		Pessoa pessoa = (Pessoa)obj;
		if(getLogin().equals(pessoa.getLogin()) == true) {
			return true;
		}
		else {
			return false;
		}
	}
	//get and Sets
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
