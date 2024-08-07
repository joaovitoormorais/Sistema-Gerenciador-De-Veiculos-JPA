package br.com.fuctura.controller;

import br.com.fuctura.dto.LojaDTO;
import br.com.fuctura.model.request.LojaRequest;
import br.com.fuctura.service.LojaService;

public class LojaController {

	private LojaService lojaService;
	public void save(LojaRequest request) {
		
	lojaService = new LojaService();
		
	}
	
	public LojaDTO mapper(LojaRequest lojaRequest) {
		var lojaDTO = new LojaDTO();
		lojaDTO.setCnpj(lojaRequest.getCnpj());
		lojaDTO.setNome(lojaRequest.getNome());
		return lojaDTO;
		
	}
}
