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
		
		tblusuario.setIdusuariot1(2);
		tblusuario.setUsuariot1("maria32323");
		tblusuario.setPasswordt1("yyyyyyy");

        tblusuarioimp.RegistrarUsuario(tblusuario);
        System.out.println("usuario registrado");
	}
}
