package pessoa;

import java.util.ArrayList;
import java.util.List;

import interfaces.InterfaceLogin;
//Banco de Dados 
public class BancoPessoas implements InterfaceLogin{
	 static private List<Pessoa> pessoas = new ArrayList<>();
	 static private List<Pessoa> administradores = new ArrayList<>();
	 static private List<Pessoa> clientes = new ArrayList<>();
	public BancoPessoas() {
	}
	
	public void cadastrarPessoa(Pessoa pessoa) {
		boolean checador = false;
		for(Pessoa obj: pessoas) {
			if(obj.equals(pessoa) == true) {
				checador = true;
			}
		}
		if(checador == false) {
			pessoas.add(pessoa);
			if (pessoa instanceof Cliente) {
				clientes.add(pessoa);
			}else if(pessoa instanceof Administrador){
				administradores.add(pessoa);
			}
		}else {
			System.out.println("ERROR|OPERAÇÃO PESSOA JÁ RESGISTRADA");
		}
	}
	public void listarClientes() {
		System.out.println("LISTA DE TODOS OS CLIENTES");
		for(Pessoa obj: clientes) {
			System.out.println(obj);
		}
	}
	@Override
	public boolean login(String login, String senha) {
		for(Pessoa obj: pessoas) {
			System.out.println(pessoas);
			String login1 = obj.getLogin().toString();
			String senha1 = obj.getSenha().toString();
			if(login1.equals(login) == true && senha1.equals(senha) == true) {
				return true;
			}
			}
		return false;
		}
	@Override
	public void registrar(String nome, String cnh, String login, String senha) {
		Cliente cliente = new Cliente(nome, login, senha);
		cliente.setCnh(cnh);
		cadastrarPessoa(cliente);
	}
}

