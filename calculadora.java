package calculadora;

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
            System.out.println("5. Salir");
            System.out.print("Elige una opcion: ");

            int opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 4)
            {
                System.out.print("Ingresa el primer numero: ");
                double num1 = scanner.nextDouble();
                System.out.print("Ingresa el segundo numero: ");
                double num2 = scanner.nextDouble();

                if (opcion == 1)
                {
                    System.out.println("Resultado de la suma: " + (num1 + num2));
                }
                else if (opcion == 2)
                {
                    System.out.println("Resultado de la resta: " + (num1 - num2));
                }
                else if (opcion == 3)
                {
                    System.out.println("Resultado de la multiplicacion: " + (num1 * num2));
                }
                else if (opcion == 4)
                {
                    if (num2 != 0)
                    {
                        System.out.println("Resultado de la division: " + (num1 / num2));
                    }
                    else
                    {
                        System.out.println("Error: No se puede dividir entre cero.");
                    }
                }
            }
            else if (opcion == 5)
            {
                continuar = false;
                System.out.println("Saliendo de la calculadora...");
            }
            else
            {
                System.out.println("Opción no valida. Intenta nuevamente.");
            }
        }
        scanner.close();
    }
}
