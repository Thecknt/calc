
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("""
        ______________________________________________
        |                                            |
        | bienvenido/a a la calculadora de consola   |
        |____________________________________________|
        """);
        int number1=0;
        int number2=0;

        while(number1 <= 0 || number2 <= 0){
            try{
                System.out.println("Ingrese el primer numero");
                number1 = input.nextInt();
                System.out.println("Ingrese el segundo numero");
                number2 = input.nextInt();
                if (number1 <= 0 || number2 <= 0){
                    System.out.println("Los numeros deben ser mayores a 0");
                }
            }catch (Exception e){
                System.out.println("Debe ingresar un numero valido");
                input.nextLine();
            }
        }

            boolean flag2 = false;
            while (!flag2) {
                System.out.println("""
                ***************************************
                *       Elija la opcion deseada       *
                * 1)sumar                             *
                * 2)Restar                            *
                * 3)multiplicar                       *
                * 4)Dividir                           *
                * 5)Ingresar otros numeros            *
                * 6)Salir                             *
                ***************************************
                """);

                int option = input.nextInt();

                switch (option) {
                    case 1 -> {
                        int sum = number1 + number2;
                        System.out.println("*****************************************");
                        System.out.println("* El resultado de la operacion es: " + sum + "   *");
                        System.out.println("*****************************************");
                        System.out.println();
                    }
                    case 2 -> {
                        int rest = number1 - number2;
                        System.out.println();
                        System.out.println("*****************************************");
                        System.out.println("* El resultado de la operacion es: " + rest + "   *");
                        System.out.println("*****************************************");
                        System.out.println();
                    }
                    case 3 -> {

                        System.out.println("*****************************************");
                        int mult = number1 * number2;
                        System.out.println("* El resultado de la operacion es: " + mult + "   *");
                        System.out.println("*****************************************");
                        System.out.println();
                    }
                    case 4 -> {
                            if (number1 > number2 ) {
                                System.out.println("*****************************************");
                                float div = (float) (number1 / number2);
                                System.out.println("* El resultado de la operacion es: " + div + "   *");
                                System.out.println("*****************************************");
                                System.out.println();
                            } else {
                                System.out.println("El primer numero ingresado debe ser mayor al segundo");
                                System.out.println();
                            }
                    }
                    case 5 -> {

                        System.out.println("Ingrese el primer numero");
                        number1 = input.nextInt();
                        System.out.println("Ingrese el segundo numero");
                        number2 = input.nextInt();
                        System.out.println();
                    }
                    case 6 -> {

                        System.out.println("Gracias por usar nuestra calculadora");
                        flag2 = true;
                        System.out.println();
                    }
                    default -> {
                        System.out.println();
                        System.out.println("Ingrese un numero valido");
                        System.out.println();
                    }
                }
            }
        }
    }

