import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class MainHashMapPersona {
    public static void main(String[] args) {
        Map<String, Integer> edades = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Ingresa el nombre de la persona (Termina con 'fin'): ");
            String nombre = sc.nextLine();

            if (nombre.equalsIgnoreCase("fin")) {
                break;
            }

            System.out.print("Ingresa la edad de " + nombre + ": ");
            int edad = sc.nextInt();
            sc.nextLine();

            edades.put(nombre, edad);
        }

        for (Map.Entry<String, Integer> entry : edades.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + " | Valor: " + entry.getValue());
        }

        System.out.println("\nEdad de Ana: " + edades.get("Ana"));
    }
}

