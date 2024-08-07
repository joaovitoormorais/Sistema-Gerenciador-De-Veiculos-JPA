package br.com.fuctura.entity;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.OneToOne;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "tb_tipoveiculo")
public class TipoVeiculo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "tipo_veiculo_seq")
	@SequenceGenerator(name = "tipo_veiculo_seq", sequenceName = "tipo_veiculo_seq", allocationSize = 1)
	@Override
	public String toString() {
		return "TipoVeiculo [codigo=" + codigo + ", descricao=" + descricao + "]";
	}

	private Integer codigo;
	private String descricao;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo, descricao);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TipoVeiculo other = (TipoVeiculo) obj;
		return Objects.equals(codigo, other.codigo) && Objects.equals(descricao, other.descricao);
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Object getVeiculo() {
		// TODO Auto-generated method stub
		return null;
	}
}
