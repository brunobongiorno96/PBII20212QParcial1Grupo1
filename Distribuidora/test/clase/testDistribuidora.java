package clase;

import static org.junit.Assert.*;

import org.junit.Test;

public class testDistribuidora {

	@Test
	public void queSePuedaAgregarUnEmpleado() {
		Departamento nuevoDepto= new Departamento("finanzas");
		Empleado nuevo= new Gerente("haziel",419284,nuevoDepto);
		Distribuidora nueva= new Distribuidora("Fargo");
		
		nueva.agregarEmpleado(nuevo);
		
		
		Empleado[] listaDeEmpleados= nueva.getEmpleados();
		String valorEsperado= "haziel";
		
		assertEquals(valorEsperado, listaDeEmpleados[0].getNombre());
	}

	@Test
	public void queSeNoPuedaAgregarUnEmpleadoRepetido() {
		
		Departamento nuevoDepto= new Departamento("finanzas");
		Empleado nuevo= new Gerente("haziel",419284,nuevoDepto);
		Empleado nuevo2= new Gerente("pablo",419284,nuevoDepto);
		Distribuidora nueva= new Distribuidora("Fargo");
		
		nueva.agregarEmpleado(nuevo);
		
		
//retocar para que no agregue dos cuit iguales de diferentes puestos

		
		assertFalse(nueva.agregarEmpleado(nuevo2));
		
		
	}
	
	@Test
	public void queSePuedaDespedirUnEmpleado() {
		Departamento nuevoDepto= new Departamento("finanzas");
		Empleado nuevo= new Gerente("haziel",419284,nuevoDepto);
		Distribuidora nueva= new Distribuidora("Fargo");		
		nueva.agregarEmpleado(nuevo);
		nueva.despedirEmpleado(nuevo);
		Empleado[] listaDeEmpleadosDespedidos= nueva.getEmpleadosDespedidos();
		Empleado[] listaDeEmpleados= nueva.getEmpleados();
		String valorEsperado= "haziel";
		
		assertEquals(valorEsperado, listaDeEmpleadosDespedidos[0].getNombre());
	}
	
	 @Test
	 public void queSePuedaEliminarUnCliente(){
	      Distribuidora distribuidora = new Distribuidora("NombreDistri");
	      Cliente len = new Cliente("Len", 22);
	      Cliente k = new Cliente("K", 19);
	      
	      distribuidora.agregarCLiente(len);
	      distribuidora.agregarCLiente(k);
	      
	      Boolean valorObt= distribuidora.eliminarCliente(len);
	      
	      assertTrue(valorObt); 
	    }







}
