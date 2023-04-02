package venta_productos.clases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Venta {
    private ArrayList<Producto> productos;

    public Venta() {
        productos = new ArrayList<Producto>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void eliminarProducto(String nombreProducto) {
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getNombre().equals(nombreProducto)) {
                productos.remove(i);
                break;
            }
        }
    }

    public Producto buscarProducto(String nombreProducto) {
        for (Producto producto : productos) {
            if (producto.getNombre().equals(nombreProducto)) {
                return producto;
            }
        }
        return null;
    }

    public void ordenarPorPrecio() {
        Collections.sort(productos);
    }

    public void mostrarProductos() {
        System.out.println("Productos en la venta:");

        for (Producto producto : this.productos) {
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Descripción: " + producto.getDescripcion());
            System.out.println("Precio: " + producto.getPrecio());
            System.out.println("Cantidad en stock: " + producto.getCantidadEnStock());
            System.out.println();
        }
    }
}
