package main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.TbUsuario;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("JPA_clase01x");
		EntityManager pr = fabrica.createEntityManager();
		
		List<TbUsuario> lstusu = pr.createQuery("Select u From TbUsuario u", TbUsuario.class).getResultList();
		System.out.println("Numero de usuarios: "+lstusu.size());
	}

}
