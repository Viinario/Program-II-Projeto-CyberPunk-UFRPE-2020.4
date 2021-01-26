package interfaces;

import veiculo.Luxo;
import veiculo.Popular;
import veiculo.Utilitario;
import veiculo.Veiculo;

import java.util.List;

import pessoa.Cliente;
// Client
public interface InterfaceCliente {
	
	List<Utilitario> visualizarUtilitarios();
	List<Popular> visualizarPopulares();
	List<Luxo> visualizarLuxos();
	List<Veiculo> visualizarHistoricoPessoal(Cliente cliente);
	List<Veiculo> visualizarTodosVeiculos();
	void alugarVeiculo(Cliente cliente, Veiculo veiculo);
	double calcularTotal(Veiculo veiculo, int dias);
	
}
