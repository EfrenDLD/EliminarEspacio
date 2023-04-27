import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una cadena: ");
        String cadenas = scanner.nextLine();
        String salida = cadenas.replaceAll(" ", "");
        System.out.println("Cadena sin espacios: " + salida);
    }
}
