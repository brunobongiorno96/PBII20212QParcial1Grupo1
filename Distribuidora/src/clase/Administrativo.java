package clase;

public class Administrativo  extends Empleado{
	
	
	public Administrativo(String nombre, Integer cuil, Departamento departamento) {
		super(nombre, cuil, departamento);
		setPorcentajeExtraSueldo(0.05);
		setPorcentajeDescuento(0.1);
	
	}


}
