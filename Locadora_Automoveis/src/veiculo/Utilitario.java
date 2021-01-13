package veiculo;
//
public class Utilitario extends Veiculo {

	private boolean quatroXquatro;
	private int assentos;
	private int cargaMaxima;
	
	public Utilitario(String fabricante, String modelo, String placa, String ano, String cor,float diaria ,boolean disponibilidade) {
		super(fabricante, modelo, placa, ano, cor, diaria ,disponibilidade);
	}
	
	@Override
	public  String toString() {
		String infoTipo = String.format("\nUTILITARIO\n");
		String infoVeiculo = String.format("\nFabricante: %s \nModelo: %s \nAno: %s \nCor: %s \nPlaca: %s ",getFabricante(), getModelo(), getAno() ,getCor(), getPlaca());
		String InfoUtilitario =  String.format("\nDisponibilidade: %s \nDiaria: R$ %.2f \nQuatroXquatro: %s \nAssentos: %s \nCargaMaxima: %sKg\n", isDisponibilidade(), getDiaria(), isQuatroXquatro()
				,getAssentos(), getCargaMaxima());
		String quebraLinha = String.format("-------------------------------");
		return quebraLinha + infoTipo + quebraLinha + infoVeiculo + InfoUtilitario + quebraLinha;
	}
	@Override
	public boolean equals(Object obj) {
		Veiculo veiculo = (Veiculo)obj;
		if(getPlaca().equals(veiculo.getPlaca()) == true) {
			return true;
		}
		else {
			return false;
		}
	}
    //Get and Sets 
	public boolean isQuatroXquatro() {
		return quatroXquatro;
	}

	public void setQuatroXquatro(boolean quatroXquatro) {
		this.quatroXquatro = quatroXquatro;
	}

	public int getAssentos() {
		return assentos;
	}

	public void setAssentos(int assentos) {
		this.assentos = assentos;
	}

	public int getCargaMaxima() {
		return cargaMaxima;
	}

	public void setCargaMaxima(int cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}

}
