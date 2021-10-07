package clase;

public class Operativo extends Empleado{
	

	public Operativo(String nombre, Integer cuil, Departamento departamento) {
		super(nombre, cuil, departamento);
		setPorcentajeExtraSueldo(0.1);
		setPorcentajeDescuento(0.05);
	}

	@Override
	public Double calcularSueldo() {
		Double sueldoFinal = 0.0;
		sueldoFinal += getSueldoBase() + (getSueldoBase()+super.getPorcentajeExtraSueldo());
		return sueldoFinal;	
		
		//Otra manera quitandole el "final" a sueldoBase
		//this.setSueldoBase(getSueldoBase()+getSueldoBase()+super.getPorcentajeExtraSueldo());
}
}
