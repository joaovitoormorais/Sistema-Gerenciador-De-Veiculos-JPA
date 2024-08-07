package br.com.fcutura.dto;

public class PlacaPrecoVeiculoDTO {
	private String placa;
	private Double preco;

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "PlacaPrecoVeiculoDTO [placa=" + placa + ", preco=" + preco + "]";
	}

	// DTO objeto de transferência de dados
}
