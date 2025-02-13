import java.util.ArrayList;
import java.util.Scanner;

import models.Arbitro;
import models.Jugador;
/* 
 * A manera de buena practica, esta practica decid implementarla de manera mas realista
 * Trate de trabajar con un código mas modular, usando paquetes y una mejor estructura
 * Cuide mas los detalles y hacer un buen código
 * Desarrolle toda la practica con apoyo de git para poder desarrollar de manera mas acertada
 * 
 * En caso de que desee revisar el historial de cambios y demás le dejo el link de la practica
 * https://github.com/Mateo-Manchola12/T6-Ligafutbol
 * 
 * Espero pueda retroalimentare sobre esta y ayudarme a mejorar como programador
 */
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
        System.out.print("\33[H\033[2J");
        System.out.flush();
        switch (_op) {
            case 1:
                insertaJugador();
                break;
            case 2:
                insertaArbitro();
                break;
            case 3:
                mostrarTodo();
                break;
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

    public static void insertaArbitro() {
        String name = InputHelpers.getString("Indique el nombre del arbitro", 2);
        String college = InputHelpers.getString("Indique el colegio del arbitro", 2);
        Boolean active = InputHelpers.getBoolean("El arbitro esta activo");
        Arbitro referee = new Arbitro(name, college, active);
        listaPer.add(referee);

    }

    public static void mostrarTodo() {
        for (Object person : listaPer) {
            System.out.println(person);
        }
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