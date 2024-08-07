package br.com.fuctura.entity;

import br.com.fuctura.enums.CargoEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_vendedor")
public class Vendedor {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private long codigo;
	@Column(length = 8, name = "nome_vendedor")
	private String nome;
	@Enumerated(EnumType.STRING)
	private CargoEnum cargo;

	private long getCodigo() {
		return codigo;
	}

	public String getNome(String nome) {
		return nome;
	}

	public String getTelefone(String telefone) {
		return telefone;
	}

	public void setCodigo(String codigo) {
		this.codigo = this.codigo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
