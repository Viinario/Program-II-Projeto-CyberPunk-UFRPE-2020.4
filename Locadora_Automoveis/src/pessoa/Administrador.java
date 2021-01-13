package pessoa;

public class Administrador extends Pessoa{
	public Administrador(String nome, String login, String senha) {
		super(nome, login, senha);
	}
	@Override
	public  String toString() {
		return String.format("\n-------ADMINISTRADOR----------\nNome: %s \nLogin: %s  \nSenha: %s",getNome(), getLogin(), getSenha());
	}
	@Override
	public boolean equals(Object obj) {
		Administrador adm = (Administrador)obj;
		if(getLogin().equals(adm.getLogin()) == true) {
			return true;
		}
		else {
			return false;
		}
	}
}
