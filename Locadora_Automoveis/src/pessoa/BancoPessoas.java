package pessoa;

import java.util.ArrayList;
import java.util.List;

import interfaces.InterfaceLogin;
//Banco de Dados 
public class BancoPessoas implements InterfaceLogin{
	private List<Pessoa> pessoas = new ArrayList<>();
	private List<Pessoa> administradores = new ArrayList<>();
	private List<Pessoa> clientes = new ArrayList<>();
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
			if((obj.getLogin() == login) && (obj.getSenha() == senha)) {
				return true;
			}
		}return false;
		
	}
	@Override
	public void registrar(String nome, String login, String senha) {
		Cliente cliente = new Cliente(nome, login, senha);
		cadastrarPessoa(cliente);
	}
}

