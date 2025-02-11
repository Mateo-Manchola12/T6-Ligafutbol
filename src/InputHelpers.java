import java.util.Scanner;

public class InputHelpers {
    private static final Scanner keyboard = new Scanner(System.in);

    public static String getString(String msg, Integer min, Integer max, boolean allowEdit) {
        String s;
        while (true) {
            System.out.printf("%n%s: ", msg);
            s = keyboard.nextLine().trim();

            if (allowEdit && s.equals("=")) {
                return null;
            }

            int length = s.length();

            if ((min == null || length >= min) && (max == null || length <= max) && !s.isBlank()) {
                return s;
            }

            if (min != null && length < min) {
                System.out.printf("Error: el texto debe tener al menos %d caracteres.%n", min);
            } else if (max != null && length > max) {
                System.out.printf("Error: el límite de caracteres es de %d.%n", max);
            } else {
                System.out.println("Error: entrada inválida, inténtelo nuevamente.");
            }
        }
    }

    public static String getString(String msg) {
        return getString(msg, null, null, false);
    }

    public static String getString(String msg, int min, int max) {
        return getString(msg, min, max, false);
    }

    public static String getString(String msg, int min) {
        return getString(msg, min, null, false);
    }

    public static String getString(String msg, boolean allowEdit) {
        return getString(msg, null, null, allowEdit);
    }

    public static boolean getBoolean(String msg) {
        String input;
        while (true) {
            System.out.printf("%n¿%s? (S/N): ", msg);
            input = keyboard.nextLine().trim().toUpperCase();

            if (input.equals("S")) {
                return true;
            } else if (input.equals("N")) {
                return false;
            } else {
                System.out.println("Error: Por favor, ingrese 'S' para Sí o 'N' para No.");
            }
        }
    }
}
