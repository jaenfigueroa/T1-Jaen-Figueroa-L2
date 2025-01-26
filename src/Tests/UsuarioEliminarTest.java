package Tests;

import Dao.TblUsuarioImp;
import model.TblUsuariot1;

public class UsuarioEliminarTest {

	public static void main(String[] args) {
		TblUsuariot1 tblusuario = new TblUsuariot1();
		TblUsuarioImp tblusuarioimp = new TblUsuarioImp();

        ////////////////////////////////////////////////////////
        // probamos el metodo eliminar
        ////////////////////////////////////////////////////////
		tblusuario.setIdusuariot1(6);
		
        tblusuarioimp.EliminarUsuario(tblusuario);
        System.out.println("Usuario eliminado");
	}
}
