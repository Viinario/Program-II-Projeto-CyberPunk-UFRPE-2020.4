package veiculo;

public class Luxo extends Veiculo{
	private boolean Disponibilidade;
	private boolean Conversivel;
	private String cambio;
	private String motor;
	private float diariaLuxo;
	public Luxo(String fabricante, String modelo, String placa, String ano, String cor) {
		super(fabricante, modelo, placa, ano, cor);	
	}
	@Override
	public  String toString() {
		String infoTipo = String.format("\nLUXO\n");
		String infoVeiculo = String.format("\nFabricante: %s \nModelo: %s \nAno: %s \nCor: %s \nPlaca: %s ",getFabricante(), getModelo(), getAno() ,getCor(), getPlaca());
		String InfoUtilitario =  String.format("\nDisponibilidade: %s \nDiaria: R$ %.2f \nConversivel: %s \nMotor: %s \nCambio: %s\n", isDisponibilidade(), getDiariaLuxo(), isConversivel()
				, getMotor(), getCambio());
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
	// Gets and Sets
	public boolean isDisponibilidade() {
		return Disponibilidade;
	}
	public void setDisponibilidade(boolean disponibilidade) {
		Disponibilidade = disponibilidade;
	}
	public boolean isConversivel() {
		return Conversivel;
	}
	public void setConversivel(boolean conversivel) {
		Conversivel = conversivel;
	}
	public String getCambio() {
		return cambio;
	}
	public void setCambio(String cambio) {
		this.cambio = cambio;
	}
	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor = motor;
	}
	public float getDiariaLuxo() {
		return diariaLuxo;
	}
	public void setDiariaLuxo(float diariaLuxo) {
		this.diariaLuxo = diariaLuxo;
	}

}
