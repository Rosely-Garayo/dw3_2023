/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
import java.util.ArrayList;
public class registro extends Estudiante{
    public ArrayList<Estudiante> estudiantes;
    

    public registro(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
    
    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
    
    
    public registro(){
        estudiantes = new ArrayList<Estudiante>();
    }
    
    public void agregar(Estudiante estudiante){
        estudiantes.add(estudiante);
    }
    
    public void eliminar(String estudiante){
        boolean encontrado = false;
        for(int i = 0; i<estudiantes.size(); i++){
            if(estudiantes.get(i).getNombre().equals(estudiante)){
                estudiantes.remove(i);
                encontrado = true;
                break;
            } 
        }if (encontrado= true) {
            System.out.println("Estudiante "+estudiante+" fue eliminado correctamente.");
        } else{
            System.out.println("Estudiante no encontrados.");
        }
    }
    
    
    public void buscar(String nombre) {
       boolean estudianteEncontrado = false;
    for (int i = 0; i < estudiantes.size(); i++) {
        Estudiante estudiante = estudiantes.get(i);
        if (estudiante != null && estudiante.getNombre().equals(nombre)) {
            System.out.println("Estudiante encontrado: " + estudiante.getNombre() + " " + estudiante.getApellido() + ", Edad: " + estudiante.getEdad() + ", Nota promedio: " + estudiante.getPromedio());
            estudianteEncontrado = true;
        }
    }
     if (!estudianteEncontrado) {
        System.out.println("El estudiante no se encuentra en el registro.");
    }
    }
    public void verRegistro() {
        System.out.println("Registro de estudiantes:");
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante.toString());
        }
    }
   
}
