package br.com.fuctura;

import br.com.fuctura.controller.LojaController;
import br.com.fuctura.model.request.LojaRequest;

public class Aplicacao2 {

	public static void main(String[] args) {
		//Invocar o scanner
		//solicitar q  o cliente digite os dados da loja
		
		var nome = "Fuctura Informática";
		var cnpj = "87690";
		
		var request = new LojaRequest();
		request.setNome(nome);
		request.setCnpj(cnpj);
		
		var controlador = new LojaController();
		controlador.save(request);//serve pra salvar

	}

}
