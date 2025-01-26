package Tests;

import Dao.TblUsuarioImp;
import model.TblUsuariot1;

public class UsuarioBuscarTest {

	public static void main(String[] args) {
		TblUsuariot1 tblusuario = new TblUsuariot1();
		TblUsuarioImp tblusuarioimp = new TblUsuarioImp();

        ////////////////////////////////////////////////////////
        // probamos el metodo buscar usuario
        ////////////////////////////////////////////////////////
		tblusuario.setIdusuariot1(943);;
		
		TblUsuariot1 usuarioencontrado = tblusuarioimp.BuscarUsuario(tblusuario);
		
		if(usuarioencontrado != null){
		       System.out.println("Usuario encontrado");
		       System.out.println("Id: " + usuarioencontrado.getIdusuariot1());
		       System.out.println("Usuario: " + usuarioencontrado.getUsuariot1());
		} else{
			System.out.println("Usuario no encontrado");
		}
	}

}
