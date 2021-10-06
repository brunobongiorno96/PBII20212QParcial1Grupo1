package clase;

public abstract class Empleado {
	
	private String nombre;
	private final Integer cuil;
	private Departamento departamento;
	private Double sueldoBase = 25000.0;
	private Double porcentajeSueldoExtra;
	private Double porcentajeDescuento;

	public double getPorcentajeDescuento() {
		return porcentajeDescuento;
	}

	public void setPorcentajeDescuento(Double porcentajeDescuento) {
		this.porcentajeDescuento = porcentajeDescuento;
	}

	public Empleado(String nombre, Integer cuil, Departamento departamento, Double sueldoBase) {
		super();
		this.nombre = nombre;
		this.cuil = cuil;
		this.departamento = departamento;
		this.sueldoBase = sueldoBase;
	}

	public  Double calcularSueldo() {
		Double sueldoFinal = 0.0;
		sueldoFinal += getSueldoBase() + (getSueldoBase()*porcentajeSueldoExtra);
		return sueldoFinal;	
	}

	public Double getPorcentajeExtraSueldo() {
		return porcentajeSueldoExtra;
	}

	public void setPorcentajeExtraSueldo(Double porcentajeExtraSueldo) {
		this.porcentajeSueldoExtra = porcentajeExtraSueldo;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public Double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(Double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public String getNombre() {
		return nombre;
	}

	public Integer getCuil() {
		return cuil;
	}
	
	
	
	
}
