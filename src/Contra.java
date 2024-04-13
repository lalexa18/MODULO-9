import java.util.Scanner;

public class Contra {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Pass validator = new Pass();

        boolean isValidPassword = false;
        String password;

        System.out.println("\nLEE ESTAS ESPECIFICACIONES PARA CREAR UNA CONTRASEÑA:");
        System.out.println("- Longitud mínima de 8 caracteres.");
        System.out.println("- Utilizar al menos 1 carácter especial.");
        System.out.println("- Utilizar al menos 2 letras mayúsculas.");
        System.out.println("- Utilizar al menos 3 letras minúsculas.");
        System.out.println("- Utilizar al menos 1 número.");


        do {
            System.out.print("\nIngrese una contraseña: ");
            password = scanner.nextLine();
            isValidPassword = validator.isValid(password);

            if (!isValidPassword) {
                System.out.println("La contraseña no cumple con las especificaciones. Intente nuevamente.");
            }
        } while (!isValidPassword);
        System.out.println("La contraseña es válida.");
        scanner.close();
    }
}



