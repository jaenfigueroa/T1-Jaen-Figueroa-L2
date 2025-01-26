package Tests;

import Dao.TblUsuarioImp;
import model.TblUsuariot1;

public class UsuarioRegistrarTest {

	public static void main(String[] args) {
		TblUsuariot1 tblusuario = new TblUsuariot1();
		TblUsuarioImp tblusuarioimp = new TblUsuarioImp();

		////////////////////////////////////////////////////////
		// probamos el metodo registrar usuario
		////////////////////////////////////////////////////////
		
		tblusuario.setUsuariot1("josecscscs");
		tblusuario.setPasswordt1("cscscscs");

        tblusuarioimp.RegistrarUsuario(tblusuario);
        System.out.println("usuario registrado");
	}
}
