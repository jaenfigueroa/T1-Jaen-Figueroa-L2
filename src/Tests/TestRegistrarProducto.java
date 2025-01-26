package Tests;

import java.util.Calendar;
import java.util.Date;

import Dao.TblProductoImp;
import model.TblProductot1;

public class TestRegistrarProducto {

	public static void main(String[] args) {
		TblProductot1 tblProd = new TblProductot1();
		TblProductoImp tblprodimp = new TblProductoImp();

		////////////////////////////////////////////////////////
		// probamos el metodo registrar producto
		////////////////////////////////////////////////////////
		
		tblProd.setNombret1("Fideos");
		tblProd.setPreciot1(12.5);
		tblProd.setDescripciont1("Fideos de alta calidad, ideal para todo tipo de platillos.");
		tblProd.setEstadot1("Disponible en stock");

		// Definir la fecha de fabricación: 3 de abril de 2000
        Calendar calFab = Calendar.getInstance();
        calFab.set(2024, Calendar.APRIL, 3, 0, 0, 0); // Año, mes, día, hora, minuto, segundo
        Date fechaFabricacion = calFab.getTime();

        // Definir la fecha de vencimiento: 3 de abril de 2004
        Calendar calVenc = Calendar.getInstance();
        calVenc.set(2026, Calendar.APRIL, 3, 0, 0, 0); // Año, mes, día, hora, minuto, segundo
        Date fechaVencimiento = calVenc.getTime();
		
        tblProd.setFechafabrit1(fechaFabricacion);
        tblProd.setFechavencimt1(fechaVencimiento);
        
        tblprodimp.RegistrarProducto(tblProd);
        System.out.println("Producto registrado en base de datos");
	}
}
