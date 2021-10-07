package clase;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Producto {

   private String nombre;
   private Integer nLote;
   private TipoApto tipoApto;
   private Double precio;
   private Date fechaVencimiento;
   private Integer cantidadDeProductosEnLaCaja;

    public Producto(String nombre, Integer nLote, TipoApto tipoApto, Double precio, Date fechaVencimiento, Integer cantidadDeProductosEnLaCaja) {
        this.nombre = nombre;
        this.nLote = nLote;
        this.tipoApto = tipoApto;
        this.precio = precio;
        this.fechaVencimiento = fechaVencimiento;
        this.cantidadDeProductosEnLaCaja = cantidadDeProductosEnLaCaja;
    }

    public Integer getCantidadDeProductosEnLaCaja() {
        return cantidadDeProductosEnLaCaja;
    }

    public void setCantidadDeProductosEnLaCaja(Integer cantidadDeProductosEnLaCaja) {
        this.cantidadDeProductosEnLaCaja = cantidadDeProductosEnLaCaja;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getnLote() {
        return nLote;
    }

    public void setnLote(Integer nLote) {
        this.nLote = nLote;
    }

    public TipoApto getTipoApto() {
        return tipoApto;
    }

    public void setTipoApto(TipoApto tipoApto) {
        this.tipoApto = tipoApto;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String formatearFecha(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String fechaFormateada = sdf.format(fechaVencimiento);
        return fechaFormateada;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return nombre.equals(producto.nombre) && nLote.equals(producto.nLote);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, nLote);
    }
}
