package Tests;

import java.util.List;

import Dao.TblUsuarioImp;
import model.TblUsuariot1;

public class UsuariosListarTest {

	public static void main(String[] args) {
		TblUsuarioImp tblusuarioimp = new TblUsuarioImp();

        ////////////////////////////////////////////////////////
        // probamos el metodo listar
        ////////////////////////////////////////////////////////

		List<TblUsuariot1> listadousuarios =  tblusuarioimp.listadoUsuarios();
		
		if(listadousuarios.isEmpty()){
			System.out.println("No se han encontrado usuarios");

		} else{
			System.out.println("---------------------------");
			System.out.println("Usuarios encontrados");
			 
			for (TblUsuariot1 usuario: listadousuarios) {
				System.out.println("---------------------------");
				System.out.println("Id: " + usuario.getIdusuariot1());
				System.out.println("Nombre: " + usuario.getUsuariot1());
				System.out.println("Password: " + usuario.getPasswordt1());
			}
		}
	}
}
