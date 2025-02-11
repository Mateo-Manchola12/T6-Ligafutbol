import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.text.StyledEditorKit.BoldAction;

import models.Jugador;

public class App {
    static Scanner keyboard = new Scanner(System.in);
    static ArrayList<Object> listaPer = new ArrayList<Object>();

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
                insertaJugador();
                break;
            case 2:
                System.out.println("Opción seleccionada #2");
                throw new UnsupportedOperationException("Unimplemented method #2");
            // break;
            case 3:
                System.out.println("Opción seleccionada #3");
                throw new UnsupportedOperationException("Unimplemented method #3");
            // break;
            case 4:
                mostrarSoloJugadores();
                break;
            case 5:
                System.out.println(jugadorMasRegate(listaPer));
                break;
            case 6:
                System.out.println(jugadorMasRegate(listaPer, 0, new Jugador()));
                break;
            case 7:
                System.out.println("Hasta Luego!");
                break;
            default:
                System.out.println("Indique una opción valida");
                break;
        }
    }

    public static void insertaJugador() {
        String name = InputHelpers.getString("Indique el nombre del jugador", 2);
        String position = InputHelpers.getString("Indique el posición del jugador", 2);
        Boolean injury = InputHelpers.getBoolean("El jugador esta lesionado");
        Jugador player = new Jugador(name, position, injury);
        listaPer.add(player);

    }

    public static void mostrarSoloJugadores() {
        for (Object person : listaPer) {
            if (person instanceof Jugador) {
                System.out.println(person);
            }
        }

    }

    public static Jugador jugadorMasRegate(ArrayList<Object> arr, int pos, Jugador temp) {
        if (arr.get(pos) instanceof Jugador) {
            Jugador jugador = (Jugador) arr.get(pos);
            if (temp.getRegate() < jugador.getRegate()) {
                temp = jugador;
            }
        }

        if (pos < arr.size() - 1) {
            return jugadorMasRegate(arr, (pos + 1), temp);
        } else
            return temp;
    }

    public static Jugador jugadorMasRegate(ArrayList<Object> arr) {
        Jugador temp = new Jugador();
        for (Object person : arr) {
            if (person instanceof Jugador) {
                Jugador jugador = (Jugador) person;

                if (temp.getRegate() < jugador.getRegate()) {
                    temp = jugador;
                }
            }
        }
        return temp;
    }
}