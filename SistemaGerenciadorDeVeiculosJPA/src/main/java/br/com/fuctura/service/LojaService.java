package br.com.fuctura.service;

import br.com.dao.impl.ILojaDAO;
import br.com.dao.impl.LojaDAOImpl;
import br.com.fuctura.dto.LojaDTO;
import br.com.fuctura.entity.Loja;
import br.com.fuctura.utils.JPAutils;

public class LojaService {
	
	private ILojaDAO lojaDAO;
	
	public void save(LojaDTO lojaDTO) {
		var em = JPAutils.getEntityManager();
		lojaDAO = new LojaDAOImpl(em);
		
		var loja = mapper(lojaDTO);
		
		lojaDAO.persist(loja);
	}

	private Loja mapper(LojaDTO lojaDTO) {
		var loja = new Loja();
		loja.setNome(lojaDTO.getNome());
		loja.setCnpj(lojaDTO.getCnpj());
		return loja;
	}
}
