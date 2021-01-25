package interfaces;

import pessoa.Cliente;

// Login
public interface InterfaceLogin {
	void registrar(String nome, String cnh, String login, String senha);
	Cliente login(String login, String senha);
}
