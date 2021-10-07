package clase;

public abstract class Empleado {
	
	private String nombre;
	private final Integer cuil;
	private Departamento departamento;

	private final Double sueldoBase ;

	private Double porcentajeSueldoExtra;
	private Double porcentajeDescuento;

	public double getPorcentajeDescuento() {
		return porcentajeDescuento;
	}
	public void setPorcentajeDescuento(Double porcentajeDescuento) {
		this.porcentajeDescuento = porcentajeDescuento;
	}

	public Empleado(String nombre, Integer cuil, Departamento departamento) {
		super();
		this.nombre = nombre;
		this.cuil = cuil;
		this.departamento = departamento;
		this.sueldoBase = 40000.0;
	}

	public abstract Double calcularSueldo();
	
	public abstract Double valorConDescuento();

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


	public String getNombre() {
		return nombre;
	}

	public Integer getCuil() {
		return cuil;
	}

	public Double getSueldoBase() {
		return sueldoBase;
	}
//Otra Manera quitandole el "Final" al sueldoBase
//	public void setSueldoBase(Double sueldoBase) {
//		this.sueldoBase = sueldoBase;
//	} 

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cuil == null) ? 0 : cuil.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		if (cuil == null) {
			if (other.cuil != null)
				return false;
		} else if (!cuil.equals(other.cuil))
			return false;
		return true;
	}
}
