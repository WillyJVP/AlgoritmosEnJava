/*
Introduccion a la computacion y programacion 1 seccion B
Laboratorio, algoritmos en java

Complete el algoritmo:

Dado un numero 'n' identifique si es par o impar

*/

public class oddEven {   

   public static void main(String[] args) {
      int num = Integer.parseInt(args[0].toString());
   		// si el numero es par
      if (((num % 2)==0)){
   			System.out.println("El numero es par");
   		}
   		else {
   		// si el numero es impar
   			System.out.println("El numero es impar");	
   		}
   }
}