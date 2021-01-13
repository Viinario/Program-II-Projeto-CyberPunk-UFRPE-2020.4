package interfaces;
//Login
public interface InterfaceLogin {
	void registrar(String nome, String login, String senha);
	boolean login(String login, String senha);
}
