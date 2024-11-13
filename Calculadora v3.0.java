package calculadora;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar)
        {
            System.out.println("\nSelecciona una operacion:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Modulo");
            System.out.println("6. Potencia");
            System.out.println("7. Salir");
            System.out.print("Elige una opcion: ");

            int opcion;
            try {
                opcion = scanner.nextInt();
            } catch (InputMismatchException e)
            {
                System.out.println("Error: Debes ingresar un numero entero.");
                scanner.next();
                continue;
            }

            if (opcion >= 1 && opcion <= 6)
            {
                double num1 = 0, num2 = 0;
                boolean validInput = false;

                while (!validInput)
                {
                    try
                    {
                        System.out.print("Ingresa el primer numero: ");
                        num1 = scanner.nextDouble();
                        System.out.print("Ingresa el segundo numero: ");
                        num2 = scanner.nextDouble();
                        validInput = true;
                    }
                    catch (InputMismatchException e)
                    {
                        System.out.println("Error: Debes ingresar un numero valido.");
                        scanner.next();
                    }
                }
                switch (opcion)
                {
                    case 1 -> System.out.println("Resultado de la suma: " + sumar(num1, num2));
                    case 2 -> System.out.println("Resultado de la resta: " + restar(num1, num2));
                    case 3 -> System.out.println("Resultado de la multiplicacion: " + multiplicar(num1, num2));
                    case 4 ->
                    {
                        if (num2 != 0)
                        {
                            System.out.println("Resultado de la division: " + dividir(num1, num2));
                        }
                        else
                        {
                            System.out.println("Error: No se puede dividir entre cero.");
                        }
                    }
                    case 5 ->
                    {
                        if (num2 != 0)
                        {
                            System.out.println("Resultado del modulo: " + modulo(num1, num2));
                        }
                        else
                        {
                            System.out.println("Error: No se puede calcular el modulo con divisor cero.");
                        }
                    }
                    case 6 -> System.out.println("Resultado de la potencia: " + potencia(num1, num2));
                }
            }
            else if (opcion == 7)
            {
                continuar = false;
                System.out.println("Saliendo de la calculadora...");
            }
            else
            {
                System.out.println("Opcion no valida. Intenta nuevamente.");
            }
        }
        scanner.close();
    }
    public static double sumar(double a, double b) { return a + b; }
    public static double restar(double a, double b) { return a - b; }
    public static double multiplicar(double a, double b) { return a * b; }
    public static double dividir(double a, double b) { return a / b; }
    public static double modulo(double a, double b) { return a % b; }
    public static double potencia(double base, double exponente) { return Math.pow(base, exponente); }
}