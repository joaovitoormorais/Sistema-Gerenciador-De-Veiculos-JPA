package br.com.fuctura.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_veiculo")
public class Veiculo {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private long codigo;
	@Column(length = 8, name = "placa_veiculo")
	private String placa;
	private String modelo;
	private double preco;

	@OneToOne(cascade =CascadeType.ALL, fetch = FetchType.LAZY )
	private Loja loja;

	public Loja getLoja() {
		return loja;
	}

	public void setLoja(Loja loja) {
		this.loja = loja;
	}

	// Getter e setter
	public long getCodigo() {
		return codigo;
	}

	@Override
	public String toString() {
		return "Veiculo [codigo=" + codigo + ", placa=" + placa + ", modelo=" + modelo + ", preco=" + preco + "]";
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
