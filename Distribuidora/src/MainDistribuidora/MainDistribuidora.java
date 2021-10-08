package MainDistribuidora;

import clase.Distribuidora;
import clase.Producto;
import clase.TipoApto;

import java.util.Scanner;

public class MainDistribuidora {
    static final Scanner teclado = new Scanner(System.in);
    static String nombre;
    static Integer numLote;
    static Double precio;
    static Integer cantidadDeProductosEnLaCaja;

    static  final int VOLVER_ATRAS = 15;

    static  final int SALIR = 0;
    static final int GESTIONAR_PRODUCTOS = 1;
    static final int GESTIONAR_EMPLEADOS = 2;
    static final int GESTIONAR_CLIENTES  = 3;

    static final int REGISTRAR_LOTE = 1;
    static final int VENDER_LOTE =2;
    static final int BUSCAR_LOTE = 3;
    static final int BUSCAR_LOTES_VENDIDOS = 4;
    public static void main(String[] args) {
        Distribuidora distribuidora = new Distribuidora("Fangio");
        int opcionDeseada = 0;

        System.out.println("Bienvenidx al sistema de gestion de la distribuidra\n " + distribuidora.getNombre());

        do {
            opcionDeseada = menuPrincipal();
            switch (opcionDeseada){
                case GESTIONAR_PRODUCTOS:
                   do {
                       opcionDeseada = menuProductos();
                       switch (opcionDeseada){

                           case REGISTRAR_LOTE:
                               menuRegistrarLote(distribuidora);
                               break;

                           case VENDER_LOTE:
                               System.out.println("1- Para vender lote a cliente Mayorista");
                               System.out.println("2- Para vender producto a cliente Minorista");
                               System.out.println("3- Para vender lote a Empleado");
                               opcionDeseada = teclado.nextInt();
                               switch (opcionDeseada){


                                   default:
                                       System.out.println("Opcion Incorrecta");
                               }
                               break;

                               case BUSCAR_LOTE:
                               break;

                           case BUSCAR_LOTES_VENDIDOS:
                               break;


                           default:
                               System.out.println("Opcion Incorrecta");
                       }


                   }while (opcionDeseada !=VOLVER_ATRAS);


                    break;

                case GESTIONAR_EMPLEADOS:
                    break;

                case GESTIONAR_CLIENTES:
                    break;

                default:
                    System.out.println("Opcion Incorrecta");
            }

        }while (opcionDeseada != SALIR);
        System.out.println("Adios.");




    }

    private static void menuRegistrarLote(Distribuidora distribuidora) {
        System.out.println("Ingrese el nombre del Producto");
        nombre = teclado.next();

        System.out.println("Ingrese el numero de lote");
        numLote = teclado.nextInt();

        System.out.println("Ingrese el precio del Lote");
        precio = teclado.nextDouble();

        System.out.println("Ingrese la cantidad de productos en el lote");
        cantidadDeProductosEnLaCaja = teclado.nextInt();

        Producto producto = new Producto(nombre,numLote,precio,cantidadDeProductosEnLaCaja);

        Boolean seAgrego = distribuidora.agregarLote(producto);
        if (seAgrego == true){
            System.out.println("El lote de numero: "+ producto.getnLote()+ " a sido creado correctamente");
        }else{
            System.out.println("El lote no pudo ser ingresado , realice la accion nuevamente");
        }
    }

    private static int menuProductos() {
        int opcionDeseada;
        int opcionDeseadaProductos;
        System.out.println("************************");
        System.out.println("Menu de Productos");
        System.out.println("1 - Registrar Lote");
        System.out.println("2 - Vender Lote");
        System.out.println("3 - Buscar lote por su numero");
        System.out.println("4 - Buscar lotes vendidos");
        System.out.println("0 - Salir");
        System.out.println("************************");
        System.out.println("Ingrese una opcion");
        opcionDeseada = teclado.nextInt();
        return opcionDeseada;

    }

    private static int menuPrincipal() {
        int opcionDeseada;
        System.out.println("************************");
        System.out.println("Menu de opciones");
        System.out.println("1 - Para gestionar Productos");
        System.out.println("2 - Para gestionar Empleados");
        System.out.println("3 - Para gestionar Clientes");
        System.out.println("0 - Salir");
        System.out.println("************************");
        System.out.println("Ingrese una opcion");
        opcionDeseada = teclado.nextInt();
        return opcionDeseada;
    }


}
