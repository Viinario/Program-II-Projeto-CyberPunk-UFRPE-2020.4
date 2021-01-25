package veiculo;

import java.util.ArrayList;
import java.util.List;

import interfaces.InterfaceCliente;
import pessoa.Cliente;
//Banco de Dados 
public class BancoVeiculos implements InterfaceCliente{
	private static List<Veiculo> veiculos = new ArrayList<>();
	private static List<Utilitario> utilitarios = new ArrayList<>(); 
	private static List<Popular> populares = new ArrayList<>(); 
	private static List<Luxo> luxos = new ArrayList<>(); 
	
public  BancoVeiculos() {
}

public void cadastrarVeiculo(Veiculo veiculo) {
	boolean checador = false;
	for(Veiculo obj: veiculos) {
		if(obj.equals(veiculo) == true) {
			checador = true;
		}
	}
	if(checador == false) {
		veiculos.add(veiculo);
		if(veiculo instanceof Utilitario) {
			 utilitarios.add((Utilitario)veiculo);
		}else if(veiculo instanceof Popular) {
			populares.add((Popular)veiculo);
		}else if(veiculo instanceof Luxo) {
			luxos.add((Luxo)veiculo);
		}
	}else {
		System.out.println("ERROR|OPERAÇÃO; ESSE VEICULO JÁ EXISTE");
	}
	}

@Override
public List<Utilitario> visualizarUtilitarios() {
	System.out.println("\nLISTA DE TODOS OS UTILITARIOS");
	for(Veiculo obj: utilitarios) {
		System.out.println(obj);
	}
	return utilitarios;
}

@Override
public List<Popular> visualizarPopulares() {
	System.out.println("\nLISTA DE TODOS OS POPULARES");
	for(Veiculo obj: populares) {
		System.out.println(obj);
	}
	return populares;
}

@Override
public List<Luxo> visualizarLuxos() {
	System.out.println("\nLISTA DE TODOS OS LUXUOSOS");
	for(Veiculo obj: luxos) {
		System.out.println(obj);
	}
	return luxos;
}

@Override
public List<Veiculo> visualizarHistoricoPessoal(Cliente cliente) {
	System.out.printf("LISTA DE TODOS OS VEICULOS CLIENTE: %s", cliente.getNome());
	for(Veiculo obj: cliente.getVeiculoHistorico()) {
		System.out.println(obj);
	}
	return cliente.getVeiculoHistorico();
}

@Override
public void alugarVeiculo(Cliente cliente, Veiculo veiculo) {
	if(veiculo.isDisponibilidade() == true) {
		veiculo.setDisponibilidade(false);
		cliente.registrarVeiculoHistorico(veiculo);
		System.out.printf("voce alugou \nVeiculo: %s \n Placa:", veiculo.getModelo(), veiculo.getPlaca());
	}else {
		System.out.println("Veiculo indisponível");
	}
}

@Override
public double calcularTotal(Veiculo veiculo, int dias) {
	double total = 0;
	total = veiculo.getDiaria() * dias;
	return total;
	
}
public Veiculo BuscarVeiculo(String placa) {
	for (Veiculo obj: veiculos){
		if (obj.getPlaca().equals(placa)) {
			return obj;
		}
	}
	return null;
	
}
}

