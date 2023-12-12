import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        mostrarMenu();
    }//fin main

    private static void mostrarMenu(){
        Scanner consola = new Scanner(System.in);

        while (true) {
            System.out.println("**** Aplicacion Calculadora ****");

            // mostrar menu
            // System.out.println("1. Suma \n 2. Resta \n 3. Multiplicacion");

            System.out.println("""
                    1. Suma
                    2. Resta
                    3. Multiplicacion
                    4. Division
                    5. Salir
                    """);
            System.out.println("Operacion a realizar? ");
            try {
                var operacion = Integer.parseInt(consola.nextLine());
                //operancion valida?
                if (operacion >= 1 && operacion <= 4) {
                    ejecutarOperacion(operacion, consola);
                } else if (operacion == 5) {
                    System.out.println("Saliendo...");
                    break; //salimos del while
                } else {
                    System.out.println("Opcion erronea " + operacion);
                }
                System.out.println();
            } //fin try
            catch (Exception e) {
                System.out.println("Ocurrio un error: "+ e.getMessage());
            }
        } //fin while
    } // fin menu

    private  static  void ejecutarOperacion(int operacion, Scanner consola){
        System.out.print("Ingresa el valor 1: ");
        var operando1 = Double.parseDouble(consola.nextLine());

        System.out.print("Ingresa el valor 2: ");
        var operando2 = Double.parseDouble(consola.nextLine());
        double resultado=0;

        switch (operacion) {
            case 1 -> { //suma
                resultado = operando1 + operando2;
            }
            case 2 -> { //resta
                resultado = operando1 - operando2;
            }
            case 3 -> { //multiplicacion
                resultado = operando1 * operando2;
            }
            case 4 -> {//division
                if (operando2==0)
                    System.out.println("No se puede dividir entre cero");
                else
                    resultado = operando1 / operando2;
            }
            default -> {
                System.out.println("Opcion erronea: " + operacion);
            }
        }//fin switch
        System.out.println("Resultado: "+ Double.toString(resultado));
    }//fin ejecutarOperacion
}//fin class
