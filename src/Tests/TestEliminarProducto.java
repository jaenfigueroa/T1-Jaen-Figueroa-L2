package Tests;

import Dao.TblProductoImp;
import model.TblProductot1;

public class TestEliminarProducto {

	public static void main(String[] args) {
		TblProductot1 tblProd = new TblProductot1();
		TblProductoImp tblprodimp = new TblProductoImp();

        ////////////////////////////////////////////////////////
        // probamos el metodo eliminar producto
        ////////////////////////////////////////////////////////
		tblProd.setIdproductot1(2);
		
        tblprodimp.EliminarProducto(tblProd);
        System.out.println("Producto eliminado en base de datos");
	}
}
