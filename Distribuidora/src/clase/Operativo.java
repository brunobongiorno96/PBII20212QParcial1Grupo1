package clase;

public class Operativo extends Empleado{
	

	public Operativo(String nombre, Integer cuil, Departamento departamento) {
		super(nombre, cuil, departamento);
		setPorcentajeExtraSueldo(0.1);
		setPorcentajeDescuento(0.05);
	}

	@Override
	public Double calcularSueldo() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
