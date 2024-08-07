package br.com.dao.impl;

import java.util.List;

import br.com.fcutura.dto.PlacaPrecoVeiculoDTO;
import br.com.fuctura.dao.IveiculoDAO;
import br.com.fuctura.entity.Veiculo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;


//tenho que colocar código aqui, não na interface!
public class VeiculoDAOImpl implements IveiculoDAO {

	public VeiculoDAOImpl(EntityManager em) {
		super();
		this.em = em;
	}

	private final EntityManager em;

	@Override
	public List<Veiculo> findAll() {
		var comandoJPQL = "select v from Veiculo v";
		var x = em.createQuery(comandoJPQL);

		TypedQuery<Veiculo> resultado = em.createQuery(comandoJPQL, Veiculo.class);

		List<Veiculo> veiculos = resultado.getResultList();

		return veiculos;

	}

	@Override
	public List<PlacaPrecoVeiculoDTO> findVeiculoByAno(int ano) {

		String comandoJPQL = "select br.com.fuctura.dto.PlacaPrecoVeiculoDTO(v.placa, v.preco)"
				+ "from Veiculo v where ano > :ano";

		TypedQuery<PlacaPrecoVeiculoDTO> resultado = em.createQuery(comandoJPQL, PlacaPrecoVeiculoDTO.class);

		resultado.setParameter("ano", ano);

		List<PlacaPrecoVeiculoDTO> resultadoConsulta = resultado.getResultList();

		return resultadoConsulta;
	}

}
