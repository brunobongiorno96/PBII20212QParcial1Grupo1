package clase;

public class Administrativo  extends Empleado{
	
	
	public Administrativo(String nombre, Integer cuil, Departamento departamento, Double sueldoBase) {
		super(nombre, cuil, departamento, sueldoBase);
		setPorcentajeExtraSueldo(0.05);
		setPorcentajeDescuento(0.1);
	
	}


}
