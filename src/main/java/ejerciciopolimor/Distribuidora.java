package ejerciciopolimor;

import java.util.ArrayList;
import java.util.List;

public class Distribuidora {
    public static void main(String[] args) {
     int cantidadDeProductos;

    List<Producto> producto = new ArrayList<>();
     producto.add(new Perecedero("Carne", 1900, 3));
     producto.add(new Perecedero("Leche", 400, 2));
     producto.add( new Perecedero("Huevos", 1500, 1));
     producto.add(new Perecedero("manzana", 250, 2));
     producto.add( new Perecedero("pera", 130, 1));
     producto.add(new NoPerecedero("arroz", 200, "np"));
     producto.add(new NoPerecedero("Harina", 180, "np"));
     producto.add(new NoPerecedero("aceite", 500, "np"));
     producto.add(new NoPerecedero("galletas", 200, "np"));
     producto.add(new NoPerecedero("azucar", 280, "np"));

    cantidadDeProductos=2;
   /*   for (Producto lista :producto){
           System.out.println(lista.toString());
           System.out.println( "precio " +  lista.calcular(cantidadDeProductos));
       }
          */
        for (int i=0; i<producto.size(); i++){
            System.out.println(producto.get(i));
            System.out.println("Precio total: " + producto.get(i).calcular(cantidadDeProductos));
        }
    }

    }


