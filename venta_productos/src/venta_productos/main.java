
package venta_productos;

import java.util.Scanner;
import venta_productos.clases.Producto;
import venta_productos.clases.Venta;
import venta_productos.clases.envio;

public class main {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Venta venta = new Venta();
      int opcion;
      
      do{
          System.out.println("1. agregar producto");
          System.out.println("2. eliminar producto");
          System.out.println("3. buscar producto");
          System.out.println("4. ordenar por precio el producto");
          System.out.println("5. calcular coste de envio");
          System.out.println("6. Mostrar todas las opciones");
          System.out.println("7. salir");
          System.out.print("elija una opcion: ");
          opcion = sc.nextInt();
          sc.nextLine();
          switch(opcion){
           case 1 -> {               
               System.out.print("Ingrese el nombre del producto (o presione enter para salir): ");
                String nombre = sc.nextLine();

                if (nombre.isEmpty()) {
                    System.out.println("No puede crear un producto sin nombre");
                    break;
                }

                System.out.print("Ingrese la descripción del producto: ");
                String descripcion = sc.nextLine();

                System.out.print("Ingrese el precio del producto: ");
                double precio = sc.nextDouble();

                System.out.print("Ingrese la cantidad en stock del producto: ");
                int cantidad = sc.nextInt();

                sc.nextLine(); 

                Producto producto = new Producto(nombre, descripcion, precio, cantidad);
                venta.agregarProducto(producto);
           }               
           case 2 -> {
               //eliminar producto
               System.out.println(" Que producto quieres eliminar: ");
               String nombreProducto = sc.nextLine();
               
               venta.eliminarProducto(nombreProducto);
              }
           case 3 -> {
               //buscar produto
               System.out.println(" Que producto quieres buscar: ");
               String nombreBuscar = sc.nextLine();
               
               Producto x = venta.buscarProducto(nombreBuscar);
                System.out.println("Nombre: " + x.getNombre());
                System.out.println("Descripción: " + x.getDescripcion());
                System.out.println("Precio: " + x.getPrecio());
                System.out.println("Cantidad en stock: " + x.getCantidadEnStock());
                System.out.println();
              }
           case 4 -> {
               venta.ordenarPorPrecio();
               System.out.println("la lista de productos ha sido ordnada por precio");
                venta.mostrarProductos();
              }
           case 5 -> {
               System.out.println("Ingrese la dirección de envío:");
               String direction = sc.nextLine();
               
               // Solicitar al usuario que ingrese la distancia en kilómetros
               System.out.println("Ingrese la distancia en kilómetros:");
               double distancia = sc.nextDouble();
               
               // Crear una instancia de Envio con la dirección ingresada
               envio env = new envio(direction);
               
               // Calcular el costo de envío
               double costo = env.calcular(distancia);
               
               // Mostrar el costo de envío por consola
               System.out.println("El costo de envío a " + direction + " es de $" + costo);
              }
           
           case 6 -> venta.mostrarProductos();
           
           case 7 -> System.out.println("chao");
           default -> System.out.println("la opcion es incorrecta");
           
          }
      }while(opcion !=7);
      sc.close();
      
      
        
        
        
      
        
        
        
     
    
    }
    
}
