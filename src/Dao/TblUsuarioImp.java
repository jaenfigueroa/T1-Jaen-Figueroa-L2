package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IUsuario;
import model.TblUsuariot1;

public class TblUsuarioImp implements IUsuario {

	@Override
	public void RegistrarUsuario(TblUsuariot1 tblusuario) {
		// conexion a la unidad de persitencia - registrar datos en BD
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("T1-Jaen-Figueroa");
		EntityManager em = emf.createEntityManager();

		try {
			em.getTransaction().begin();
			em.persist(tblusuario); // invocamos al metodo registrar
			em.getTransaction().commit(); // confirmamos

		} catch (RuntimeException e) {
			e.getMessage();
		} finally {
			em.close();
		}
	}

	@Override
	public void ActualizarUsuario(TblUsuariot1 tblusuario) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("T1-Jaen-Figueroa");
		EntityManager em = emf.createEntityManager();

		try {
			em.getTransaction().begin();
			em.merge(tblusuario); // invocamos al metodo actualizar
			em.getTransaction().commit(); // confirmamos

		} catch (RuntimeException e) {
			e.getMessage();
		} finally {
			em.close();
		}
	}

	@Override
	public void EliminarUsuario(TblUsuariot1 tblusuario) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("T1-Jaen-Figueroa");
		EntityManager em = emf.createEntityManager();

		try {
			em.getTransaction().begin();
			
			// buscamos el usuario a eliminar
			TblUsuariot1 tblusuarioelim = em.find(TblUsuariot1.class, tblusuario.getIdusuariot1()); 
			
			if (tblusuarioelim != null) {
				em.remove(tblusuarioelim); // invocamos al metodo eliminar
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
	public TblUsuariot1 BuscarUsuario(TblUsuariot1 tblusuario) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("T1-Jaen-Figueroa");
		EntityManager em = emf.createEntityManager();
		
		TblUsuariot1 tbluser = null;

		try {
			em.getTransaction().begin();
			
			// buscamos el usuario
			tbluser = em.find(TblUsuariot1.class, tblusuario.getIdusuariot1()); 
			
			em.getTransaction().commit(); // confirmamos

		} catch (RuntimeException e) {
			if(em.getTransaction().isActive()){
				em.getTransaction().rollback();
			}
			
			e.getMessage();
		} finally {
			em.close();
		}
		
		return tbluser;
	}

	@Override
	public List<TblUsuariot1> listadoUsuarios() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("T1-Jaen-Figueroa");
		EntityManager em = emf.createEntityManager();
		
		List<TblUsuariot1> listadousuarios = null;

		try {
			em.getTransaction().begin();
			
			// realizamos busqueda dirigida a la entidad
			listadousuarios = em.createQuery("select x from TblUsuariot1 x", TblUsuariot1.class).getResultList();
			
			em.getTransaction().commit(); // confirmamos

		} catch (RuntimeException e) {
			if(em.getTransaction().isActive()){
				em.getTransaction().rollback();
			}
			
			e.getMessage();
		} finally {
			em.close();
		}
		
		return listadousuarios;
	}

}
