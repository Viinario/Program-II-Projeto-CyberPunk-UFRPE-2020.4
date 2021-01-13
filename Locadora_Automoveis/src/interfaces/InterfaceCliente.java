package interfaces;

import veiculo.Veiculo;

import java.util.ArrayList;
import java.util.List;

import pessoa.Cliente;

public interface InterfaceCliente {
	
	List<Veiculo> visualizarUtilitarios();
	List<Veiculo> visualizarPopulares();
	List<Veiculo> visualizarLuxos();
	List<Veiculo> visualizarHistoricoPessoal(Cliente cliente);
	void alugarVeiculo(Cliente cliente, Veiculo veiculo);
	double calcularTotal(Veiculo veiculo, int dias);
	
}
