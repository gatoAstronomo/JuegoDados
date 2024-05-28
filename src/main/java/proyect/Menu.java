package proyect;

import java.util.Scanner;

public class Menu {
    private JuegoDados juego;
    private Scanner scanner;
    private int opcion;

    public Menu() {
        juego = new JuegoDados();
        scanner = new Scanner(System.in);
    }

    private int pedirOpcion(){
        int entero = 0;
        boolean esEntero = false;

        do {
            try {
                System.out.println("Ingrese una opción: ");
                entero = Integer.parseInt(scanner.nextLine());
                esEntero = true;
            } catch (NumberFormatException e) {
                System.out.println("Por favor ingrese una opcion valida");
            }
        } while (!esEntero);

        return entero;
    }

    private void mostrarMenu() {
        System.out.println("1. Jugar");
        System.out.println("2. Salir");
    }

    private void jugar() {
        limpiarPantalla();
        juego.lanzarDados();
        juego.mostrarResultado();
        if (juego.esVictoria()) {
            System.out.println("Usted a GANDADO!!!!");
        } else {
            System.out.println("Usted PERDIO :C");
        }
    }

    private void salir() {
        limpiarPantalla();
        System.out.println("Adios");
    }

    private void opcionIvalida() {
        System.out.println("Opcion invalida");
    }

    private void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void mainloop(){
        do {

            mostrarMenu();
            opcion = pedirOpcion();
            switch (opcion) {
                case 1 -> jugar();
                case 2 -> salir();
                default -> opcionIvalida();
            }
        } while (opcion != 2);
    }
}
