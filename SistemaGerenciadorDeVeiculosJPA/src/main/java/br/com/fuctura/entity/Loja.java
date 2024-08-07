package br.com.fuctura.entity;

import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_loja")
public class Loja {

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "meu_gerador")
	@SequenceGenerator(name = "meu_gerador", initialValue = 1, allocationSize = 1)
	private Integer codigo;
	private String nome;
	private String cnpj;
	private LocalDateTime dhCriacao;
	
	
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "codigo_endereco")
	private Endereco endereco;
	
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	@PrePersist
	public void prePersist() {
		this.dhCriacao = LocalDateTime.now();
	}

}
