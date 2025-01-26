package Tests;

import java.util.Calendar;
import java.util.Date;

import Dao.TblProductoImp;
import model.TblProductot1;

public class TestModificarProducto {

	public static void main(String[] args) {
		TblProductot1 tblProd = new TblProductot1();
		TblProductoImp tblprodimp = new TblProductoImp();

        ////////////////////////////////////////////////////////
        // probamos el metodo actualizar producto
        ////////////////////////////////////////////////////////
		tblProd.setIdproductot1(1);
		
		tblProd.setNombret1("Arroz Majenio");
		tblProd.setPreciot1(15);
		tblProd.setDescripciont1("Arroz de alta calidad, ideal para todo tipo de platillos.");
		tblProd.setEstadot1("Disponible en stock");
		
		// Definir la fecha de fabricación: 3 de abril de 2000
        Calendar calFab1 = Calendar.getInstance();
        calFab1.set(2024, Calendar.APRIL, 3, 0, 0, 0); // Año, mes, día, hora, minuto, segundo
        Date fechaFabricacion1 = calFab1.getTime();

        // Definir la fecha de vencimiento: 3 de abril de 2004
        Calendar calVenc1 = Calendar.getInstance();
        calVenc1.set(2026, Calendar.APRIL, 3, 0, 0, 0); // Año, mes, día, hora, minuto, segundo
        Date fechaVencimiento1 = calVenc1.getTime();
		
        tblProd.setFechafabrit1(fechaFabricacion1);
        tblProd.setFechavencimt1(fechaVencimiento1);
		
        tblprodimp.ActualizarProducto(tblProd);;
        System.out.println("Producto actualizado en base de datos");
	}
}
