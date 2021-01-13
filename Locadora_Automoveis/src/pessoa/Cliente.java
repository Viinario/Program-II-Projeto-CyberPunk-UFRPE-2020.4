package pessoa;

import java.util.ArrayList;
import java.util.List;

import veiculo.Veiculo;
//
public class Cliente extends Pessoa{
	private String cnh;
	private List<Veiculo> historicoVeiculos = new ArrayList<>();
	public Cliente(String nome, String login, String senha) {
		super(nome, login, senha);
	}
	@Override
	public  String toString() {
		return String.format("\n-------CLIENTE----------\nNome: %s \nLogin: %s  \nSenha: %s",getNome(), getLogin(), getSenha());
	}
	@Override
	public boolean equals(Object obj) {
		Cliente cliente = (Cliente)obj;
		if(getLogin().equals(cliente.getLogin()) == true) {
			return true;
		}
		else {
			return false;
		}
	}
	public void registrarVeiculoHistorico(Veiculo veiculo) {
		boolean checador = false;
		for(Veiculo obj: historicoVeiculos) {
			if(obj.equals(veiculo) == true) {
				checador = true;
			}
		}if(checador == false) {
			historicoVeiculos.add(veiculo);
		}else {
			System.out.println("ERROR|OPERAÇÃO VEICULA JA REGISTRADO");
		}
	}
	//get Sets
	public String getCnh() {
		return cnh;
	}
	public void setCnh(String cnh) {
		this.cnh = cnh;
	}
	public List<Veiculo> getVeiculoHistorico() {
		return historicoVeiculos;
	}
}
