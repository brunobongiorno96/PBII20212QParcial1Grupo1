package clase;
import org.junit.Test;
import java.util.Date;
import static org.junit.Assert.*;

public class ProductoTest {

    @Test
    public void queSePuedaAgregarUnProducto(){
        Distribuidora distribuidora = new Distribuidora("Distribuidora");
        Date fechaVencimiento = new Date(121,10,06);
        Producto pepa = new Producto("Pepa", 100, TipoApto.APTO_CELIACO, 1000.0, fechaVencimiento,100);
        Producto pepaa = new Producto("Pepaa", 100, TipoApto.APTO_CELIACO, 1000.0, fechaVencimiento,100);

        distribuidora.agregarLote(pepa);
        distribuidora.agregarLote(pepaa);
        String NOMBRE_ESPERA = "Pepa";
        String NOMBRE_ESPERA_DOS = "Pepaa";
        Integer NLOTE_ESPERADO = 100;
        assertEquals(NOMBRE_ESPERA,pepa.getNombre());
        assertEquals(NOMBRE_ESPERA_DOS,pepaa.getNombre());

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







}
