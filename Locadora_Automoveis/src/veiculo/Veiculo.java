package veiculo;

public abstract class Veiculo {
private String fabricante;
private String modelo;
private String placa;
private String ano;
private String cor;
private float diaria;
private boolean disponibilidade;

public Veiculo(String fabricante, String modelo, String placa, String ano, String cor, float diaria , boolean disponibilidade) {
	this.setFabricante(fabricante);
	this.setModelo(modelo);
	this.setPlaca(placa);
	this.setAno(ano);
	this.setCor(cor);
	this.setDiaria(diaria);
	this.setDisponibilidade(disponibilidade);
}
@Override
public  String toString() {
	return String.format(" fabricante: %s modelo: %s ano: %s cor: %s placa: %s",getFabricante(), getModelo(), getAno() ,getCor(), getPlaca());
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

// Get and Set Methods: 
public String getFabricante() {
	return fabricante;
}

public void setFabricante(String fabricante) {
	this.fabricante = fabricante;
}

public String getModelo() {
	return modelo;
}

public void setModelo(String modelo) {
	this.modelo = modelo;
}

public String getPlaca() {
	return placa;
}

public void setPlaca(String placa) {
	this.placa = placa;
}

public String getAno() {
	return ano;
}

public void setAno(String ano) {
	this.ano = ano;
}

public String getCor() {
	return cor;
}

public void setCor(String cor) {
	this.cor = cor;
}
public boolean isDisponibilidade() {
	return disponibilidade;
}
public void setDisponibilidade(boolean disponibilidade) {
	this.disponibilidade = disponibilidade;
}
public float getDiaria() {
	return diaria;
}
public void setDiaria(float diaria) {
	this.diaria = diaria;
}
}
