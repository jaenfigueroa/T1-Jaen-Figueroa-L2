package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IProducto;
import model.TblProductot1;

public class TblProductoImp implements IProducto {

	@Override
	public void RegistrarProducto(TblProductot1 tblproducto) {
		
		// conexion a la unidad de persitencia - registrar datos en BD
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("T1-Jaen-Figueroa");
		EntityManager em = emf.createEntityManager();

		try {
			em.getTransaction().begin();
			em.persist(tblproducto); // invocamos al metodo registrar
			em.getTransaction().commit(); // confirmamos

		} catch (RuntimeException e) {
			e.getMessage();
		} finally {
			em.close();
		}
	}

	@Override
	public void ActualizarProducto(TblProductot1 tblproducto) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("T1-Jaen-Figueroa");
		EntityManager em = emf.createEntityManager();

		try {
			em.getTransaction().begin();
			em.merge(tblproducto); // invocamos al metodo actualizar
			em.getTransaction().commit(); // confirmamos

		} catch (RuntimeException e) {
			e.getMessage();
		} finally {
			em.close();
		}
	}

	@Override
	public void EliminarProducto(TblProductot1 tblproducto) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("T1-Jaen-Figueroa");
		EntityManager em = emf.createEntityManager();

		try {
			em.getTransaction().begin();
			
			// buscamos el prod a eliminar
			TblProductot1 tblprdoelim = em.find(TblProductot1.class, tblproducto.getIdproductot1()); 
			
			if (tblprdoelim != null) {
				em.remove(tblprdoelim); // invocamos al metodo eliminar
			}
			
			em.getTransaction().commit(); // confirmamos

		} catch (RuntimeException e) {
			if(em.getTransaction().isActive()){
				em.getTransaction().rollback();
			}
			
			e.getMessage();
		} finally {
			em.close();
		}
	}

	@Override
	public TblProductot1 BuscarProducto(TblProductot1 tblproducto) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("T1-Jaen-Figueroa");
		EntityManager em = emf.createEntityManager();
		
		TblProductot1 tblprod = null;

		try {
			em.getTransaction().begin();
			
			// buscamos el prod
			tblprod = em.find(TblProductot1.class, tblproducto.getIdproductot1()); 
			
			em.getTransaction().commit(); // confirmamos

		} catch (RuntimeException e) {
			if(em.getTransaction().isActive()){
				em.getTransaction().rollback();
			}
			
			e.getMessage();
		} finally {
			em.close();
		}
		
		return tblprod;
	}
	
	@Override
	public List<TblProductot1> ListadoProductos() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("T1-Jaen-Figueroa");
		EntityManager em = emf.createEntityManager();
		
		List<TblProductot1> listadoprods = null;

		try {
			em.getTransaction().begin();
			
			// realizamos busqueda dirigida a la entidad
			listadoprods = em.createQuery("select x from TblProductot1 x", TblProductot1.class).getResultList();
			
			em.getTransaction().commit(); // confirmamos

		} catch (RuntimeException e) {
			if(em.getTransaction().isActive()){
				em.getTransaction().rollback();
			}
			
			e.getMessage();
		} finally {
			em.close();
		}
		
		return listadoprods;
	}

}
