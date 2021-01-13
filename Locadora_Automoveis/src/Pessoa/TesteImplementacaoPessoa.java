package Pessoa;

public class TesteImplementacaoPessoa {

	public static void main(String[] args) {
		BancoPessoas bancoPessoa = new BancoPessoas();
		BancoPessoas bancoAdm = new BancoPessoas();
		Administrador adm = new Administrador("amd","admin","adm123");
		bancoAdm.cadastrarPessoa(adm);
		Cliente cliente = new Cliente("Vicent","vicent2021","123");
		bancoPessoa.cadastrarPessoa(cliente);
		Cliente cliente1 = new Cliente("Adam","Adam20","123");
		bancoPessoa.cadastrarPessoa(cliente1);
		Cliente cliente2 = new Cliente("Alfred","Alfred1","123");
		bancoPessoa.cadastrarPessoa(cliente2);
		bancoPessoa.listarClientes();
		
	}

}
