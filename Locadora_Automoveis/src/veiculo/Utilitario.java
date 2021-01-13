package veiculo;

public class Utilitario extends Veiculo {

	private boolean Disponibilidade;
	private boolean quatroXquatro;
	private float diariaUtilitario;
	private int assentos;
	private int cargaMaxima;
	
	public Utilitario(String fabricante, String modelo, String placa, String ano, String cor) {
		super(fabricante, modelo, placa, ano, cor);
	}
	
	@Override
	public  String toString() {
		String infoTipo = String.format("\nUTILITARIO\n");
		String infoVeiculo = String.format("\nFabricante: %s \nModelo: %s \nAno: %s \nCor: %s \nPlaca: %s ",getFabricante(), getModelo(), getAno() ,getCor(), getPlaca());
		String InfoUtilitario =  String.format("\nDisponibilidade: %s \nDiaria: R$ %.2f \nQuatroXquatro: %s \nAssentos: %s \nCargaMaxima: %sKg\n", isDisponibilidade(), getDiariaUtilitario(), isQuatroXquatro()
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
	public boolean isDisponibilidade() {
		return Disponibilidade;
	}

	public void setDisponibilidade(boolean disponibilidade) {
		Disponibilidade = disponibilidade;
	}

	public boolean isQuatroXquatro() {
		return quatroXquatro;
	}

	public void setQuatroXquatro(boolean quatroXquatro) {
		this.quatroXquatro = quatroXquatro;
	}

	public float getDiariaUtilitario() {
		return diariaUtilitario;
	}

	public void setDiariaUtilitario(float diariaUtilitario) {
		this.diariaUtilitario = diariaUtilitario;
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
