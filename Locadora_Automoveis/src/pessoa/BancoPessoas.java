package pessoa;

import java.util.ArrayList;
import java.util.List;

public class BancoPessoas {
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
}

