package br.com.fuctura;

import java.util.Scanner;

import br.com.dao.impl.VeiculoDAOImpl;
import br.com.fuctura.dao.IveiculoDAO;
import br.com.fuctura.entity.Loja;
import br.com.fuctura.entity.TipoVeiculo;
import br.com.fuctura.entity.Veiculo;
import br.com.fuctura.entity.Vendedor;
import jakarta.persistence.Persistence;

public class Aplicacao {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		var  emf = Persistence.createEntityManagerFactory("FUCTURA-PU");
		
		var em = emf.createEntityManager();

		var veiculo = new Veiculo();
		veiculo.setPlaca("xyu-6754");
		veiculo.setPreco(15.87);
		veiculo.setModelo("Vitrus");
		em.getTransaction().begin();
		em.persist(veiculo);
		em.getTransaction().commit();
		
		var loja = new Loja();
		loja.setNome("Pedragon");
		loja.setCnpj("1478527896");
		daoloja.persist(loja);
		
		em.getTransaction().begin();
		em.persist(veiculo);
		//em.persist(loja);
		em.getTransaction().commit();
		
		em.detach(veiculo.getLoja());
		em.detach(loja);
		System.out.println("Nome da Loja:" + veiculo.getLoja().getNome());
		
		
		var vendedor = new Vendedor();
		vendedor.setNome("Rogério");
		em.getTransaction().begin();
		em.persist(vendedor);
		em.getTransaction().commit();
		System.out.println(veiculo);
		System.out.println(vendedor);
		
		var tipoveic = new TipoVeiculo();
			tipoveic.setCodigo(null);
			tipoveic.setDescricao("Tesla");
			em.getTransaction().begin();
			em.persist(tipoveic);
			em.getTransaction().commit();
			
			
		IveiculoDAO dao = new VeiculoDAOImpl(em);
		var resultadoConsulta = dao.findAll();
		
		
		resultadoConsulta.stream().forEach(System.out::println); // O System.out::println é uma
		//referência a método, são formas de simplificar o uso do lambda
}

}