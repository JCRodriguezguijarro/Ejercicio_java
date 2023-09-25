package calculadorafacil;

//crear una calculadora simple(recuerda el metodo scanner y usar break para el switch)

import java.util.Scanner;

public class calculadorafacil {

  public static void main(String[] args) {
      // Crear un objeto Scanner para leer la entrada del usuario
      Scanner scanner = new Scanner(System.in);

      // Mostrar un mensaje de bienvenida
      System.out.println("Calculadora Simple");
      System.out.println("Ingrese dos números y una operación (+, -, *, /):");

      // Leer el primer número 
      System.out.print("Número 1: ");
      double numero1 = scanner.nextDouble();

      // Leer la operación 
      System.out.print("Operación (+, -, *, /): ");
      char operacion = scanner.next().charAt(0);

      // Leer el segundo número 
      System.out.print("Número 2: ");
      double numero2 = scanner.nextDouble();

      // Realizar la operación pedida por el usuario
      double resultado = 0.0;
      switch (operacion) {
          case '+':
              resultado = numero1 + numero2;
              break;
          case '-':
              resultado = numero1 - numero2;
              break;
          case '*':
              resultado = numero1 * numero2;
              break;
          case '/':
              if (numero2 != 0) {
                  resultado = numero1 / numero2;
              } else {
                  System.out.println("Error: No se puede dividir por cero.");
                  // Salir del programa si se intenta dividir por cero
                  System.exit(1);
              }
              break;
          default:
              System.out.println("Operación no válida.");
              // Salir del programa si se ingresa una operación no válida
              System.exit(1);
      }

      // Mostrar el resultado
      System.out.println("Resultado: " + resultado);

      // Importante Cerrar el scanner
      scanner.close();
  }
}