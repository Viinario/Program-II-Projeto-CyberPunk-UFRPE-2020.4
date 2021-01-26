package interfaces;

import java.util.List;

import pessoa.Administrador;
import pessoa.Cliente;

// Login
public interface InterfaceLogin {
	public void RegistrarAdm(String nome, String login, String senha);
	void registrar(String nome, String cnh, String login, String senha);
	Cliente login(String login, String senha);
	Administrador loginAdm(String login, String senha);
	List<Cliente> listarClientes();
}
