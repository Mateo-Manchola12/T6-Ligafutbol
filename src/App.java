import java.util.Scanner;

public class App {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        Integer op = null;
        do {
            op = getMenuOption();
            runMenuOption(op);
        } while (op != 7);

    }

    public static Integer getMenuOption() {
        String menu = """
                \t1) Insertar jugador
                \t2) Insertar arbitro
                \t3) Mostrar todos
                \t4) Mostrar solo jugadores
                \t5) Jugador con mas regate (iterativo)
                \t6) Jugador con mas regate (recursivo)
                \t7) Salir
                Seleccione una opción:""";
        Integer op = null;
        do {
            System.out.print(menu);

            try {
                op = Integer.parseInt(keyboard.nextLine().trim());
            } catch (Exception e) {
                System.out.println("Indique un numero");
                op = null;
            }
        } while (op == null);
        return op;

    }

    public static void runMenuOption(Integer _op) {
        switch (_op) {
            case 1:
                System.out.println("Opción seleccionada #1");
                throw new UnsupportedOperationException("Unimplemented method #1");
            // break;
            case 2:
                System.out.println("Opción seleccionada #2");
                throw new UnsupportedOperationException("Unimplemented method #2");
            // break;
            case 3:
                System.out.println("Opción seleccionada #3");
                throw new UnsupportedOperationException("Unimplemented method #3");
            // break;
            case 4:
                System.out.println("Opción seleccionada #4");
                throw new UnsupportedOperationException("Unimplemented method #4");
            // break;
            case 5:
                System.out.println("Opción seleccionada #5");
                throw new UnsupportedOperationException("Unimplemented method #5");
            // break;
            case 6:
                System.out.println("Opción seleccionada #6");
                throw new UnsupportedOperationException("Unimplemented method #6");
            // break;
            case 7:
                System.out.println("Hasta Luego!");
                break;
            default:
                System.out.println("Indique una opción valida");
                break;
        }
    }
}