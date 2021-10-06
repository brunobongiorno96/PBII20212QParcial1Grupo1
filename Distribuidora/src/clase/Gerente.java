package clase;

public class Gerente  extends Empleado{


	public Gerente(String nombre, Integer cuil, Departamento departamento) {
		super(nombre, cuil, departamento);
		setPorcentajeExtraSueldo(0.15);
		setPorcentajeDescuento(0.15);
		
	}

	
	

}
