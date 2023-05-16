import net.salesianos.duolingo.utilities.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        final Scanner KEYBOARD = new Scanner(System.in);
        boolean salir = false;
        String word;

        while (!salir) {
            int opcion;
            System.out.println("1. Añadir palabra");
            System.out.println("2. Eliminar palabra");
            System.out.println("3. Existe palabra");
            System.out.println("4. Mostrar iniciales disponibles");
            System.out.println("5. Ver palabras por inicial");
            System.out.println("6. Cerrar programa");
            opcion = KEYBOARD.nextInt();
            switch (opcion) {
                case 1:
                    KEYBOARD.nextLine();
                    System.out.println("Escriba la palabra que desa añadir");
                    word = KEYBOARD.nextLine().toLowerCase();
                    word = word.replace(" ", "");
                    dictionary.addWord(word);
                    break;
                case 2:
                     KEYBOARD.nextLine();
                    System.out.println("Escriba la palabra que desa eliminar");
                    word = KEYBOARD.nextLine().toLowerCase();
                    word = word.replace(" ", "");
                    dictionary.deleteWord(word);
                    break;
                case 3:
                    KEYBOARD.nextLine();
                    System.out.println("Escriba la palabra que desa comprobar");
                    word = KEYBOARD.nextLine().toLowerCase();
                    word = word.replace(" ", "");
                    dictionary.existWord(word);
                    break;
                case 4:
                    dictionary.showInitials();
                    break;
                case 5:
                    dictionary.showWords();
                    break;
                case 6:
                    salir = true;
                    break;
            }
        }
    }
}