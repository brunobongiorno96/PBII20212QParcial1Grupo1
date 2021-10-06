package clase;

public class Operativo extends Empleado{
	

	public Operativo(String nombre, Integer cuil, Departamento departamento, Double sueldoBase) {
		super(nombre, cuil, departamento, sueldoBase);
		setPorcentajeExtraSueldo(0.1);
		setPorcentajeDescuento(0.05);
	}
	
}
