package veiculo;

import java.util.ArrayList;
import java.util.List;

public class BancoVeiculos {
	private List<Veiculo> veiculos = new ArrayList<>();
	private List<Veiculo> utilitarios = new ArrayList<>(); 
	private List<Veiculo> populares = new ArrayList<>(); 
	private List<Veiculo> luxos = new ArrayList<>(); 
	
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
			 utilitarios.add(veiculo);
		}else if(veiculo instanceof Popular) {
			populares.add(veiculo);
		}else if(veiculo instanceof Luxo) {
			luxos.add(veiculo);
		}
	}else {
		System.out.println("ERROR|OPERAÇÃO; ESSE VEICULO JÁ EXISTE");
	}
	}
public void listarVeiculos() {
	System.out.println("LISTA DE TODOS OS VEICULOS");
	for(Veiculo obj: veiculos) {
		System.out.println(obj);
	}
}
public void listarUtilitarios() {
	System.out.println("\nLISTA DE TODOS OS UTILITARIOS");
	for(Veiculo obj: utilitarios) {
		System.out.println(obj);
	}
}
public void listarLuxos() {
	System.out.println("\nLISTA DE TODOS OS LUXUOSOS");
	for(Veiculo obj: luxos) {
		System.out.println(obj);
	}
}
public void listarPopulares() {
	System.out.println("\nLISTA DE TODOS OS POPULARES");
	for(Veiculo obj: populares) {
		System.out.println(obj);
	}
}
}

