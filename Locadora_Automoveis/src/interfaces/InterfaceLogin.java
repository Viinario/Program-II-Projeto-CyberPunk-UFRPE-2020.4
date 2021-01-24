package interfaces;
// Login
public interface InterfaceLogin {
	void registrar(String nome, String cnh, String login, String senha);
	boolean login(String login, String senha);
}
