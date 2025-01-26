package Tests;

import Dao.TblUsuarioImp;
import model.TblUsuariot1;

public class UsuarioModificarTest {

	public static void main(String[] args) {
		TblUsuariot1 tblusuario = new TblUsuariot1();
		TblUsuarioImp tblusuarioimp = new TblUsuarioImp();

        ////////////////////////////////////////////////////////
        // probamos el metodo actualizar usuario
        ////////////////////////////////////////////////////////
		tblusuario.setIdusuariot1(1);
		tblusuario.setUsuariot1("jaen32323");
		tblusuario.setPasswordt1("xxxxxxxx");

        tblusuarioimp.ActualizarUsuario(tblusuario);
        System.out.println("Usuario actualizado en base de datos");
	}
}
