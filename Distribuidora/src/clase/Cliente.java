package clase;

public class Cliente {

    private String nombre;
    private Integer cuil;

    public Cliente(String nombre,Integer cuil) {
        this.nombre = nombre;
        this.cuil= cuil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCuil() {
        return cuil;
    }

    public void setCuil(Integer cuil) {
        this.cuil = cuil;
    }
}
