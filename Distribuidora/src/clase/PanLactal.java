package clase;

import java.util.Date;

public class PanLactal extends  Producto{

    public PanLactal(String nombre, Integer nLote, TipoApto tipoApto, Double precio, Date fechaVencimiento, Integer cantidadDeProductosEnLaCaja) {
        super(nombre, nLote, tipoApto, precio, fechaVencimiento, cantidadDeProductosEnLaCaja);
    }
}
