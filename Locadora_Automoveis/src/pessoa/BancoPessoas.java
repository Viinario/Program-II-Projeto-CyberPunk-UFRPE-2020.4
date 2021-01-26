package pessoa;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import interfaces.InterfaceLogin;
//Banco de Dados 
public class BancoPessoas implements InterfaceLogin{
	 static private List<Pessoa> pessoas = new ArrayList<>();
	 static private List<Administrador> administradores = new ArrayList<>();
	 static private List<Cliente> clientes = new ArrayList<>();
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
				clientes.add((Cliente) pessoa);
				JOptionPane.showMessageDialog(null,"Conta Criada Com Sucesso!");
			}else if(pessoa instanceof Administrador){
				administradores.add((Administrador)pessoa);
			}
		}else {
			JOptionPane.showMessageDialog(null,"Falha ao criar conta. \n Conta ja existente.", "Error log", JOptionPane.WARNING_MESSAGE);
		}
	}
	@Override
	public  List<Cliente> listarClientes() {
		return  clientes;
	}
	@Override
	public Cliente login(String login, String senha) {
		for(Cliente obj: clientes) {
			System.out.println(pessoas);
			String login1 = obj.getLogin().toString();
			String senha1 = obj.getSenha().toString();
			if(login1.equals(login) == true && senha1.equals(senha) == true) {
				return obj;
			}
			}
		return null;
		}
	@Override
	public void registrar(String nome, String cnh, String login, String senha) {
		if (login.equals("admin") == true){
			JOptionPane.showMessageDialog(null,"Login Invalido","Login Error", JOptionPane.WARNING_MESSAGE);
		}else {
			Cliente cliente = new Cliente(nome, login, senha);
			cliente.setCnh(cnh);
			cadastrarPessoa(cliente);
		}
	}
	@Override
	public Administrador loginAdm(String login, String senha) {
		for(Administrador obj: administradores) {
			String login1 = obj.getLogin().toString();
			String senha1 = obj.getSenha().toString();
			if(login1.equals(login) == true && senha1.equals(senha) == true) {
				return obj;
		}
	}
		return null;
}
	@Override
	public void RegistrarAdm(String nome, String login, String senha) {
		Administrador adm = new Administrador(nome, login, senha);
		administradores.add(adm);
	}
}

