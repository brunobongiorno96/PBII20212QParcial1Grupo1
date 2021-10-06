package clase;

public class Distribuidora {

    private String nombre;
    private Producto[] productos;
    private Cliente [] clientes;
    private Producto[] productosVendidos;



    public Distribuidora(String nombre) {
        this.nombre = nombre;
        this.productos = new Producto[100];
        this.clientes = new Cliente[100];
        this.productosVendidos = new Producto[100];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

    public Producto[] getProductosVendidos() {
        return productosVendidos;
    }

    public void setProductosVendidos(Producto[] productosVendidos) {
        this.productosVendidos = productosVendidos;
    }


    public Boolean agregarLote(Producto producto) {
        Boolean seAgrego = false;
        for (int i = 0; i < productos.length; i++) {
            if (productos[i] == null) {
                productos[i] = producto;
                seAgrego = true;
                break;
            }
        }
        return seAgrego;
    }
    public Boolean agregarCLiente(Cliente cliente) {
        Boolean seAgrego = false;
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] == null) {
                clientes[i] = cliente;
                seAgrego = true;
                break;
            }
        }
        return seAgrego;
    }

    public Producto buscarLote(Integer numeroLote) {
        Producto loteBuscado = null;
        for (int i = 0; i < productos.length; i++) {
            if (productos[i] != null) {
                if (productos[i].getnLote().equals(numeroLote)) {
                    loteBuscado = productos[i];
                    break;
                }
            }
        }
        return loteBuscado;
    }
    public Cliente buscarCliente(Integer cuil) {
        Cliente clienteBuscado = null;
        for (int i = 0; i < clientes.length; i++) {
            if (clientes[i] != null) {
                if (clientes[i].getCuil().equals(cuil)) {
                    clienteBuscado = clientes[i];
                    break;
                }
            }
        }
        return clienteBuscado;
    }


    public Boolean venderLote (Integer numeroLote, Integer cuilCliente){
        Boolean seVendio = false;
        if (this.buscarCliente(cuilCliente) != null){
        for (int i = 0; i < productos.length; i++) {
            if (productos[i] != null){
                if (productos[i].getnLote().equals(numeroLote)){
                    agregarLoteVendido(productos[i]);
                    productos[i] = null;
                    seVendio = true;
                    break;
                }
            }
        }
        }
        return seVendio;
    }

    public Boolean agregarLoteVendido (Producto lote){
        Boolean seAgrego = false;
        for (int i = 0; i < productosVendidos.length; i++) {
            if (productosVendidos[i] == null){
                productosVendidos[i] = lote;
                seAgrego = true;
                break;
            }
        }
        return seAgrego;
    }
    public Producto [] lotesVendidos (){
        return productosVendidos;

    }


}


