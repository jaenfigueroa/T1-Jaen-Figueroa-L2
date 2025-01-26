package Tests;

import java.util.List;

import Dao.TblProductoImp;
import model.TblProductot1;

public class TestListarProductos {

	public static void main(String[] args) {
		TblProductot1 tblProd = new TblProductot1();
		TblProductoImp tblprodimp = new TblProductoImp();

        ////////////////////////////////////////////////////////
        // probamos el metodo listar productos
        ////////////////////////////////////////////////////////

		List<TblProductot1> listadoprods =  tblprodimp.ListadoProductos();
		
		if(listadoprods.isEmpty()){
			System.out.println("No se han encontrado productos");

		} else{
			System.out.println("---------------------------");
			System.out.println("Productos encontrados");
			 
			for (TblProductot1 prod: listadoprods) {
				System.out.println("---------------------------");
				System.out.println("Id: " + prod.getIdproductot1());
				System.out.println("Nombre: " + prod.getNombret1());
				System.out.println("Precio: " + prod.getPreciot1());
				System.out.println("Estado: " + prod.getEstadot1());
			}
		}
	}
}
