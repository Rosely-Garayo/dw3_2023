
package venta_productos.clases;

public class envio {
  
    public String direction;
    
    public envio(String direction) {
        this.direction = direction;
    }
    
    public double calcular(double distancia){
        return distancia *0.5;
    }

}
