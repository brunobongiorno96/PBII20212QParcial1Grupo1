package clase;

public class Gerente  extends Empleado{


	public Gerente(String nombre, Integer cuil, Departamento departamento, Double sueldoBase) {
		super(nombre, cuil, departamento, sueldoBase);
		setPorcentajeExtraSueldo(0.15);
		setPorcentajeDescuento(0.15);
		
	}

	
	

}
