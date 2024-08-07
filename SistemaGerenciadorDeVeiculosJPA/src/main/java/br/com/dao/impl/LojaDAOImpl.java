package br.com.dao.impl;

import br.com.fuctura.dao.IveiculoDAO;
import br.com.fuctura.entity.Loja;
import jakarta.persistence.EntityManager;

public class LojaDAOImpl implements ILojaDAO {

	private final EntityManager entityManager;
	
	public LojaDAOImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public void persist(Loja loja) {
		// TODO Auto-generated method stub
		
	}


	}

