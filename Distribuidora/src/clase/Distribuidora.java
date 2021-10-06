package clase;

public class Distribuidora {


private String nombre;
private Empleado[]empleados;

public Distribuidora(String nombre) {
	super();
	this.nombre=nombre;
	this.empleados= new Empleado [100];
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public Empleado[] getEmpleados() {
	return empleados;
}

public void setEmpleados(Empleado[] empleados) {
	this.empleados = empleados;
}


public Boolean agregarEmpleado(Empleado empleado) {
	
	Boolean seAgrego=false;
	
	if (!(comprobarSiExisteUnEmpleado(empleado)))
	for (int i = 0; i < empleados.length; i++) {
		if(empleados[i]==null)
			empleados[i]= empleado;
			
		seAgrego=true;
		break;
	}
	return seAgrego;
	



}

public Boolean comprobarSiExisteUnEmpleado(Empleado empleado) {
	
	Boolean existe= false;
	
	for (int i = 0; i < empleados.length; i++) {
		if(empleados[i]!=null)
		if(empleados[i].equals(empleado))
			
			existe=true;
		
		
	}
	return existe;
	
}

}


