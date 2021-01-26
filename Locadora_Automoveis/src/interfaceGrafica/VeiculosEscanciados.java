package interfaceGrafica;

import veiculo.Luxo;
import veiculo.Popular;
import veiculo.Utilitario;

public class VeiculosEscanciados extends TelaVeiculo {

	public static void main(String[] args) {
	}
public VeiculosEscanciados() {
	//Popular I
			Popular popular = new Popular("Chevrolet", "Onix", "ABC-1217", "2020", "Vermelha", 60, true);
			popular.setConsumo(10);
			popular.setArCondicionado(true);
			popular.setCambio("Automático");
		bancoVeiculos.cadastrarVeiculo(popular);
		
		//Popular II
		Popular popular2 = new Popular("Ford", "FordK", "AVR-123", "2012", "Azul", 48, true);
		popular2.setConsumo(7);
		popular2.setArCondicionado(true);
		popular2.setCambio("Manual");
	bancoVeiculos.cadastrarVeiculo(popular2);

	//Popular III
		Popular popular3 = new Popular("FIAT", "Uno", "BRT-895", "2002", "Preto", 20, true);
		popular3.setConsumo(17);
		popular3.setArCondicionado(true);
		popular3.setCambio("Manual");
	bancoVeiculos.cadastrarVeiculo(popular3);

	//Popular IV
		Popular popular4 = new Popular("Volkswagen", "Gol", "BRA-456", "2019", "Cinza", 50, true);
		popular4.setConsumo(9);
		popular4.setArCondicionado(true);
		popular4.setCambio("Automático");
	bancoVeiculos.cadastrarVeiculo(popular4);

	//Popular V
		Popular popular5 = new Popular("Renault", "Sandero", "DMP-567", "2016", "Verde", 58, true);
		popular5.setConsumo(4);
		popular5.setArCondicionado(true);
		popular5.setCambio("Manual");
	bancoVeiculos.cadastrarVeiculo(popular5);
	
	//Utilitario I
	Utilitario utilitario = new Utilitario("Mercedes-Benz", "Atego", "KMZ-997", "2021", "Cinza", 1000, true);
	utilitario.setCargaMaxima(1000);
	utilitario.setQuatroXquatro(true);
	utilitario.setAssentos(3);
	bancoVeiculos.cadastrarVeiculo(utilitario);
	
	//Utilitarie II
	Utilitario utilitario2 = new Utilitario("MAN", "TGX", "KTZ-997", "2020", "Amarelo", 700, true);
	utilitario2.setCargaMaxima(750);
	utilitario2.setQuatroXquatro(false);
	utilitario2.setAssentos(4);
	bancoVeiculos.cadastrarVeiculo(utilitario2);
	
	//Utilitarie III
		Utilitario utilitario3 = new Utilitario("EURO", "FULL", "ZTH-167", "2010", "Verde", 400, true);
		utilitario3.setCargaMaxima(750);
		utilitario3.setQuatroXquatro(true);
		utilitario3.setAssentos(4);
		bancoVeiculos.cadastrarVeiculo(utilitario3);
		
		//Utilitarie IV
				Utilitario utilitario4 = new Utilitario("Volvo", "FE", "MJH-997", "2020", "Preto", 1700, true);
				utilitario4.setCargaMaxima(2750);
				utilitario4.setQuatroXquatro(true);
				utilitario4.setAssentos(8);
				bancoVeiculos.cadastrarVeiculo(utilitario4);
				
				//Utilitarie V
				Utilitario utilitario5 = new Utilitario("Mercedes-Benz", "Actros.", "MJU-987", "2020", "Preto", 2000, true);
				utilitario5.setCargaMaxima(4750);
				utilitario5.setQuatroXquatro(true);
				utilitario5.setAssentos(16);
				bancoVeiculos.cadastrarVeiculo(utilitario5);
	
	//Luxo I
				Luxo luxo = new Luxo("CHIRON", "SPORT", "FAST-999", "2021", "Branco", 19000, true);
				luxo.setCambio("Automático");
				luxo.setConversivel(false);
				luxo.setMotor("V12");
				bancoVeiculos.cadastrarVeiculo(luxo);
				
				//Luxo II
				Luxo luxo2 = new Luxo("MASERATI", "MC20","FCYP-699", "2020", "Branco", 8000, true);
				luxo2.setCambio("Automático");
				luxo2.setConversivel(true);
				luxo2.setMotor("V6");
				bancoVeiculos.cadastrarVeiculo(luxo2);
				
				//Luxo III
				Luxo luxo3 = new Luxo("Pininfarina","Battista","KLGK-1111","2020","Preto",18000, true);
				luxo3.setCambio("Automático");
				luxo3.setConversivel(false);
				luxo3.setMotor("V12");
				bancoVeiculos.cadastrarVeiculo(luxo3);
				
				//Luxo IV
				Luxo luxo4 = new Luxo("McLaren","Speedtail", "MAMA-000","2020", "Cinza",14000, true);
				luxo4.setCambio("Manual");
				luxo4.setConversivel(true);
				luxo4.setMotor("V8");
				bancoVeiculos.cadastrarVeiculo(luxo4);
				
				//Luxo V
				Luxo luxo5 = new Luxo("BUGATTI", "110 ANS", "OMGG-900", "2020", "Preto", 11000, true);
				luxo5.setCambio("Manual");
				luxo5.setConversivel(false);
				luxo5.setMotor("V12");
				bancoVeiculos.cadastrarVeiculo(luxo5);
				
}
}
