/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

public class estudianteInternacional extends Estudiante{
    public String pais;

    public estudianteInternacional(String pais, String nombre, String apellido, int edad, Double promedio) {
        super(nombre, apellido, edad, promedio);
        this.pais = pais;
    }

    public estudianteInternacional() {
    }

   

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    @Override
    public String toString() {
        return super.toString() + ", país de origen: " + pais;
    }
    
}
