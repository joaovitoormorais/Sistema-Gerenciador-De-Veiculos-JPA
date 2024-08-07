package br.com.fuctura.utils;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAutils {

	//Singleton
	
	private static EntityManagerFactory emf = null;
	
	public static EntityManager getEntityManager() {
		if(emf == null) {
			emf = Persistence.createEntityManagerFactory("FUCTURA-PU");
		}
		return emf.createEntityManager();
	}
}
