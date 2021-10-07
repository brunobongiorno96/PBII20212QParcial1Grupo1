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
		Empleado nuevo2= new Administrativo("haziel",419284,nuevoDepto);
		Distribuidora nueva= new Distribuidora("Fargo");
		
		nueva.agregarEmpleado(nuevo);
		
		
//metodo arreglado, era borrar el getClass en el equals generado en la clase empleado

		
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
	      
	      					distribuidora.eliminarCliente(k);
	      Boolean valorObt= distribuidora.eliminarCliente(len);
	      
	      assertTrue(valorObt); 
	     
	    }
	 @Test
		public void queSePuedaCalcularSueldoDeEmpleados() {
			Departamento departamento= new Departamento("DepartamentoNombre");
			Empleado len= new Gerente("Len",20,departamento);
			Empleado k= new Administrativo("K",19,departamento);
			Empleado u= new Operativo("U",11,departamento);
			
			Distribuidora nueva= new Distribuidora("Wawa");
			
			nueva.agregarEmpleado(len);
			nueva.agregarEmpleado(k);
			nueva.agregarEmpleado(u);

			Double sueldoEsperadoLen= len.getSueldoBase()+4000.0;
			Double sueldoEsperadoK= k.getSueldoBase()+(k.getSueldoBase()*0.05);
			Double sueldoEsperadoU= u.getSueldoBase()+(u.getSueldoBase()*0.1);
			
			assertEquals(sueldoEsperadoLen, len.calcularSueldo(), 0.01);
			assertEquals(sueldoEsperadoK, k.calcularSueldo(), 0.01);
			assertEquals(sueldoEsperadoU, u.calcularSueldo(), 0.01);
			
		}







}
