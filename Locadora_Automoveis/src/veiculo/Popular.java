package veiculo;
//
public class Popular extends Veiculo{
	private float consumo;
	private boolean arCondicionado;
	private String cambio;
	public Popular(String fabricante, String modelo, String placa, String ano, String cor, float diaria ,boolean disponibilidade) {
		super(fabricante, modelo, placa, ano, cor, diaria ,disponibilidade);
	}
	
	@Override
	public  String toString() {
		String infoTipo = String.format("\nPOPULAR\n");
		String infoVeiculo = String.format("\nFabricante: %s \nModelo: %s \nAno: %s \nCor: %s \nPlaca: %s ",getFabricante(), getModelo(), getAno() ,getCor(), getPlaca());
		String InfoUtilitario =  String.format("\nDisponibilidade: %s \nDiaria: R$ %.2f \nConsumo %sKm/L \nArCondicionado: %s \nCambio: %s\n", isDisponibilidade(), getDiaria(), getConsumo()
				, isArCondicionado(), getCambio());
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
	//get and Sets
	public float getConsumo() {
		return consumo;
	}
	public void setConsumo(float consumo) {
		this.consumo = consumo;
	}
	public boolean isArCondicionado() {
		return arCondicionado;
	}
	public void setArCondicionado(boolean arCondicionado) {
		this.arCondicionado = arCondicionado;
	}
	public String getCambio() {
		return cambio;
	}
	public void setCambio(String cambio) {
		this.cambio = cambio;
	}

}
