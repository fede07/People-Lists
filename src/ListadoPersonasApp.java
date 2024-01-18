import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListadoPersonasApp {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        var salir = false;
        List<Persona> personas = new ArrayList<>();
        while (!salir) {
            mostrarMenu();
            try{
                salir = ejecutarOperacion(console, personas);
            }catch(Exception exception){
                System.out.println("Error: " + exception.getMessage());
            }
            System.out.println();
        }
    }

    private static boolean ejecutarOperacion(Scanner console, List<Persona> personas) {
        var opcion = Integer.parseInt(console.nextLine());
        var salir = false;
        switch (opcion) {
            case 1 -> {
                System.out.print("Nombre: ");
                var nombre = console.nextLine();
                System.out.print("Tel: ");
                var tel = console.nextLine();
                System.out.print("Email: ");
                var email = console.nextLine();
                var persona = new Persona(nombre, tel, email);
                personas.add(persona);
                System.out.println("La lista tiene: " + personas.size() + " elementos");
            }
            case 2 -> {
                System.out.println("Listado de Personas: ");
                personas.forEach(System.out::println);
            }
            case 3 -> {
                System.out.println("Goodbye!");
                salir = true;
            }
            default -> System.out.println("Opcion erronea");
        }
        return salir;
    }

    private static void mostrarMenu(){
        System.out.print("""
                **** Listado Personas App ****
                1.Agregar
                2.Listar
                3.Salir
                """);
        System.out.print("Opcion elegida: ");
    }
}