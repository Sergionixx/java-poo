package sergio_martinez.actividades.actividad2.ui;

import sergio_martinez.actividades.actividad2.process.NameValidator;
import sergio_martinez.actividades.actividad2.process.NumberGenerator;

import java.util.Scanner;

public class CLI {

    /**
     * Muestra el menu
     */
    public static void showMenu(){
        System.out.println("\n====================");
        System.out.println("1. Namecheck");
        System.out.println("2. DemoIterations");
        System.out.println("3. Exit");
        System.out.println("====================");

    }

    /**
     * Metodo que se encarga de que la app corra
     */
    public static void runApp(){
        Scanner scanner = new Scanner(System.in);

        showMenu();
        int opciones = scanner.nextInt();scanner.nextLine();
        System.out.println("====================");

        while (opciones != 3){
            switch(opciones){
                case 1:
                    System.out.println("Ingrese su nombre: ");
                    System.out.println("====================");
                    String name = scanner.nextLine();

                    if (NameValidator.validateName(name)){
                        System.out.println("El nombre coincide");
                    }
                    else{
                        System.out.println("El nombre no coincide");
                    }
                    break;
                case 2:
                    System.out.println("Numeros pares del 2 al 100: ");
                    for (int i : NumberGenerator.generateNumbers()){
                        System.out.print(" "+i);
                    }
                    break;
                default:
                    System.out.println("Introduzca un dato valido");
            }


            showMenu();
            opciones = scanner.nextInt();scanner.nextLine();



        }


    }


}
