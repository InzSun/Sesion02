package main;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.TbCategoria;
import model.TbProducto;
import model.TbProveedor;

public class PruebaProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("JPA_clase01x");
		EntityManager pro = fabrica.createEntityManager();
		
		
		pro.getTransaction().begin();
		TbProducto producto = new TbProducto();
		BigDecimal precio;
		TbCategoria categoria = new TbCategoria();
		categoria.setIdcategoria(5);
		TbProveedor proveedor = new TbProveedor();
		proveedor.setIdproveedor(1);
		
		producto.setIdProd("P0021");
		producto.setDesProd("Patito Extreme");
		producto.setStkProd(50);
		producto.setPreProd(new BigDecimal(100.25));
		producto.setTbCategoria(categoria);
		producto.setEstProd((byte)1);
		producto.setTbProveedor(proveedor);
		
		pro.persist(producto);
		pro.getTransaction().commit();
		
		
		//Vista
		/*
		List<TbProducto> lstpro = pro.createQuery("Select p From TbProducto p", TbProducto.class).getResultList();
		System.out.println("Nro de Productos:´"+lstpro.size())*/
	}

}
