package Tests;

import Dao.TblProductoImp;
import model.TblProductot1;

public class ProductoBuscarTest {

	public static void main(String[] args) {
		TblProductot1 tblProd = new TblProductot1();
		TblProductoImp tblprodimp = new TblProductoImp();

        ////////////////////////////////////////////////////////
        // probamos el metodo buscar producto
        ////////////////////////////////////////////////////////
		tblProd.setIdproductot1(2);
		
		TblProductot1 prodencontrado = tblprodimp.BuscarProducto(tblProd);
		
        System.out.println("Producto encontrado en base de datos");
        System.out.println("Id: " + prodencontrado.getIdproductot1());
        System.out.println("Nombre: " + prodencontrado.getNombret1());
        System.out.println("Precio: " + prodencontrado.getPreciot1());
        System.out.println("Estado: " + prodencontrado.getEstadot1());
	}

}
