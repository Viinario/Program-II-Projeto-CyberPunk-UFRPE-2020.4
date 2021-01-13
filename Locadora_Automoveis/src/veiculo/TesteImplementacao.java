package veiculo;

public class TesteImplementacao {

	public static void main(String[] args) {
		BancoVeiculos bancoVeiculos = new BancoVeiculos();
		Utilitario utilitario = new Utilitario("Ford", "SUV", "FGS2022", "2020", "Amarelo");
		utilitario.setDiariaUtilitario(290);
		utilitario.setCargaMaxima(100);
		utilitario.setAssentos(6);
		utilitario.setDisponibilidade(true);
		utilitario.setQuatroXquatro(true);
		bancoVeiculos.cadastrarVeiculo(utilitario);
		Utilitario utilitario2 = new Utilitario("Ford", "SUV", "BCA2021", "2020", "Azul");
		utilitario2.setDiariaUtilitario(200);
		utilitario2.setCargaMaxima(300);
		utilitario2.setAssentos(4);
		utilitario2.setDisponibilidade(true);
		utilitario2.setQuatroXquatro(true);
		bancoVeiculos.cadastrarVeiculo(utilitario2);
		Popular popular = new Popular("Hyundai", "HB20S", "DFG2021", "2021", "Preto");
		popular.setArCondicionado(true);
		popular.setCambio("Automático");
		popular.setConsumo(10);
		popular.setDiariaPopular(100);
		popular.setDisponibilidade(true);
		bancoVeiculos.cadastrarVeiculo(popular);
		Luxo luxo = new Luxo("BMW", "I30", "SUPER2022", "2021", "Branca");
		luxo.setConversivel(false);
		luxo.setDisponibilidade(true);
		luxo.setDiariaLuxo(600);
		luxo.setCambio("Manual");
		luxo.setMotor("V6");
		bancoVeiculos.cadastrarVeiculo(luxo);
		
		bancoVeiculos.listarVeiculos();
		bancoVeiculos.listarUtilitarios();
		bancoVeiculos.listarPopulares();
		bancoVeiculos.listarLuxos();
		
		
	}

}
