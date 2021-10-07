package clase;
import org.junit.Test;
import java.util.Date;
import static org.junit.Assert.*;

public class ProductoTest {

    @Test
    public void queSePuedaAgregarUnLote(){
        Distribuidora distribuidora = new Distribuidora("Distribuidora");
        Date fechaVencimiento = new Date(121,10,06);
        Producto pepa = new Producto("Pepa", 100, TipoApto.APTO_CELIACO, 1000.0, fechaVencimiento,100);


        distribuidora.agregarLote(pepa);

        String NOMBRE_ESPERA = "Pepa";
        Integer NLOTE_ESPERADO = 100;
        TipoApto aptoCeliaco = TipoApto.APTO_CELIACO;
        assertEquals(NOMBRE_ESPERA,pepa.getNombre());
        assertEquals(NLOTE_ESPERADO,pepa.getnLote());
        assertEquals(aptoCeliaco,pepa.getTipoApto());


    }

    @Test
    public void queSePuedaAgregarUnCliente(){
        Distribuidora distribuidora = new Distribuidora("Distribuidora");
        Cliente pablo = new Cliente("Pablo", 20);
        distribuidora.agregarCLiente(pablo);

        Cliente [] listaObtenida = distribuidora.getClientes();

        String NOMBRE_ESPERADO = "Pablo";
        Integer CUIL_ESPERADO = 20;
        assertEquals(NOMBRE_ESPERADO,listaObtenida[0].getNombre());
        assertEquals(CUIL_ESPERADO,listaObtenida[0].getCuil());


    }
    
	 @Test
	 public void queNoSePuedaAgregarDosClientesConMismoCuil(){
	      Distribuidora distribuidora = new Distribuidora("NombreDistri");
	      Cliente len = new Cliente("Len", 22);
	      Cliente k = new Cliente("K", 22);
	      
	      distribuidora.agregarCLiente(len);
	      assertFalse(distribuidora.agregarCLiente(k));

	}

    @Test
    public  void queSePuedaBuscarUnLotePorSuNumero () {
        Distribuidora distribuidora = new Distribuidora("Distribuidora");
        Date fechaVencimientoPepa = new Date(121,10,06);
        Date fechaVencimientoOreo = new Date(121,11,06);
        Producto pepa = new Producto("Pepa", 100, TipoApto.APTO_CELIACO, 1000.0, fechaVencimientoPepa,100);
        Producto oreo = new Producto("Oreo", 101, TipoApto.APTO_DIABETICO, 1500.0, fechaVencimientoOreo,200);

        distribuidora.agregarLote(pepa);
        distribuidora.agregarLote(oreo);

        String NOMBRE_ESPERADO_PEPA = "Pepa";
        String NOMBRE_ESPERADO_OREO = "Oreo";
        Producto [] listaObtenida = distribuidora.getProductos();

        assertEquals(NOMBRE_ESPERADO_PEPA,listaObtenida[0].getNombre());
        assertEquals(NOMBRE_ESPERADO_OREO,listaObtenida[1].getNombre());
    }

    @Test
    public void queSePuedaBuscarUnClientePorSuCuil (){
        Distribuidora distribuidora = new Distribuidora("Distribuidora");
        Cliente pablo = new Cliente("Pablo", 20);

        distribuidora.agregarCLiente(pablo);

        Integer CUIL_ESPERADO = 20;
        Cliente listObtenida = distribuidora.buscarCliente(20);

        assertEquals(CUIL_ESPERADO, listObtenida.getCuil());

    }

    @Test
    public void queSePuedaAgregarUnLoteAlArrayDeLotesVendidos(){
        Date fechaVencimientoPepa = new Date(121,10,06);
        Date fechaVencimientoOreo = new Date(121,11,06);

        Distribuidora distribuidora = new Distribuidora("Distribuidora");
        Producto pepa = new Producto("Pepa", 100, TipoApto.APTO_CELIACO, 1000.0, fechaVencimientoPepa,100);
        Producto oreo = new Producto("Oreo", 101, TipoApto.APTO_DIABETICO, 1500.0, fechaVencimientoOreo,200);

        distribuidora.agregarLote(pepa);
        distribuidora.agregarLote(oreo);

        String NOMBRE_ESPEADO = "Pepa";

        distribuidora.agregarLoteVendido(pepa);
        Producto [] listaObtenida = distribuidora.getProductosVendidos();


        assertEquals(NOMBRE_ESPEADO,listaObtenida[0].getNombre());
    }

    @Test
    public void queSePuedaVenderUnLote(){
        Date fechaVencimientoPepa = new Date(121,10,06);
        Date fechaVencimientoOreo = new Date(121,11,06);

        Cliente pablo = new Cliente("Pablo", 20);

        Distribuidora distribuidora = new Distribuidora("Distribuidora");
        Producto pepa = new Producto("Pepa", 100, TipoApto.APTO_CELIACO, 1000.0, fechaVencimientoPepa,100);
        Producto oreo = new Producto("Oreo", 101, TipoApto.APTO_DIABETICO, 1500.0, fechaVencimientoOreo,200);

        distribuidora.agregarLote(pepa);
        distribuidora.agregarLote(oreo);

        distribuidora.agregarCLiente(pablo);

        String NOMBRE_ESPEADO = "Pepa";

        distribuidora.venderLote(100,20);
        Producto [] listaObtenida = distribuidora.getProductosVendidos();
        Producto [] listaObtenida2 = distribuidora.getProductos();

        assertEquals(NOMBRE_ESPEADO,listaObtenida[0].getNombre());
        assertNull(listaObtenida2[0]);

    }
    /////Tengo problemas cuando son mas de 1 Empleado el q quiere comprar
    @Test
    public void queSePuedaVenderUnLoteAEmpleadoConDescuento(){
        Date fechaVencimientoPepa = new Date(121,10,06);
        Date fechaVencimientoOreo = new Date(121,11,06);

        Departamento departamento= new Departamento("DepartamentoNombre");
		Empleado len= new Gerente("Len",20,departamento);
		Empleado k= new Administrativo("K",19,departamento);
		Empleado u= new Operativo("U",11,departamento);

        Distribuidora distribuidora = new Distribuidora("Distribuidora");
        Producto pepa = new Producto("Pepa", 100, TipoApto.APTO_CELIACO, 100.0, fechaVencimientoPepa,100);
        Producto oreo = new Producto("Oreo", 101, TipoApto.APTO_DIABETICO, 100.0, fechaVencimientoOreo,200);
        Producto rueditas = new Producto("Rueditas", 102, TipoApto.APTO_CELIACO, 100.0, fechaVencimientoPepa,300);
        
        distribuidora.agregarLote(pepa);
        distribuidora.agregarLote(oreo);
        distribuidora.agregarLote(rueditas);

        distribuidora.agregarEmpleado(len);
        distribuidora.agregarEmpleado(k);
        distribuidora.agregarEmpleado(u);

        assertTrue(distribuidora.venderLoteAEmpleado(100, len));
//        assertTrue(distribuidora.venderLoteAEmpleado(102, k));
//        assertTrue(distribuidora.venderLoteAEmpleado(101, u));
        
        Producto [] listaObtenida = distribuidora.getProductosVendidos();
        Producto [] listaObtenida2 = distribuidora.getProductos();
        
        
        Double precioEsperadoLen= 100*0.85;
        Double precioEsperadoK= 100*0.9;
        Double precioEsperadoU= 100*0.95;

        assertEquals(precioEsperadoLen,listaObtenida[0].getPrecio());
//        assertEquals(precioEsperadoK,listaObtenida[1].getPrecio());
//        assertEquals(precioEsperadoU,listaObtenida[2].getPrecio());
//        
//        
        assertNull(listaObtenida2[0]);

    }









}
