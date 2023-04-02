
package registro_estudiante;
import clases.Estudiante;
import clases.registro;
import clases.estudianteInternacional;
import java.util.Scanner;
public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        registro regis = new registro();
        
        //se agregan a los estudiantes por teclado
        
         int opcion = 0;
        do {
            System.out.println("Menu:");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Eliminar estudiante");
            System.out.println("3. Buscar estudiante");
            System.out.println("4. Mostrar registro de estudiantes");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva linea en el buffer del scanner

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Apellido: ");
                    String apellido = scanner.nextLine();
                    System.out.print("Edad: ");
                    int edad = scanner.nextInt();
                    System.out.print("Nota promedio: ");
                    double promedio = scanner.nextDouble();
                    scanner.nextLine(); // Consumir la nueva linea en el buffer del scanner
                    System.out.print("Es estudiante internacional? (Y/N): ");
                    String respuesta = scanner.nextLine();
                    if (respuesta.equalsIgnoreCase("Y")) {
                        System.out.print("Ingrese el pais de origen del estudiante: ");
                        String pais = scanner.nextLine();
                        estudianteInternacional estudiante = new estudianteInternacional(pais, nombre, apellido, edad, promedio);
                        regis.agregar(estudiante);
                    } else {
                        Estudiante estudiante = new Estudiante(nombre, apellido, edad, promedio);
                        regis.agregar(estudiante);
                    }
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del estudiante a eliminar: ");
                    String estudiante1 = scanner.nextLine();
                    regis.eliminar(estudiante1);
                    
                    break;


                case 3:
                    System.out.print("Ingrese el nombre del estudiante a buscar: ");
                    String nombreBuscar = scanner.nextLine();
                    regis.buscar(nombreBuscar);
                    
                    break;
                case 4:
                    regis.verRegistro();
                    break;
                case 5:
                    System.out.println("fin");
                    break;
                default:
                    System.out.println("el numero no existe");
            }
        } while (opcion != 5);

        scanner.close();
    }
    
}
