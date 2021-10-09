package clase;
import org.junit.Test;
import java.util.Date;
import static org.junit.Assert.*;

public class ProductoTest {

    @Test
    public void queSePuedaAgregarUnLote(){
        Distribuidora distribuidora = new Distribuidora("Distribuidora");

        Producto pepa = new Producto("Pepa", 100, 1000.0,100);


        distribuidora.agregarLote(pepa);

        String NOMBRE_ESPERA = "Pepa";
        Integer NLOTE_ESPERADO = 100;
        TipoApto aptoCeliaco = TipoApto.APTO_CELIACO;
        assertEquals(NOMBRE_ESPERA,pepa.getNombre());
        assertEquals(NLOTE_ESPERADO,pepa.getnLote());



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
    public  void queSePuedaBuscarUnLotePorSuNumero () {
        Distribuidora distribuidora = new Distribuidora("Distribuidora");

        Producto pepa = new Producto("Pepa", 100, 1000.0,100);
        Producto oreo = new Producto("Oreo", 101, 1500.0,200);

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


        Distribuidora distribuidora = new Distribuidora("Distribuidora");
        Producto pepa = new Producto("Pepa", 100, 1000.0,100);
        Producto oreo = new Producto("Oreo", 101, 1500.0,200);

        distribuidora.agregarLote(pepa);
        distribuidora.agregarLote(oreo);

        String NOMBRE_ESPEADO = "Pepa";

        distribuidora.agregarLoteVendido(pepa);
        Producto [] listaObtenida = distribuidora.getProductosVendidos();


        assertEquals(NOMBRE_ESPEADO,listaObtenida[0].getNombre());
    }

    @Test
    public void queSePuedaVenderUnLote(){

        Cliente pablo = new Cliente("Pablo", 20);

        Distribuidora distribuidora = new Distribuidora("Distribuidora");
        Producto pepa = new Producto("Pepa", 100, 1000.0,100);
        Producto oreo = new Producto("Oreo", 101, 1500.0,200);

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









}
