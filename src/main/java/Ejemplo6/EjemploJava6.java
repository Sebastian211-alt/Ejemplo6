/*

Calcula la nota de un trimestre de la asignatura Programación. El programa
pedirá las dos notas que ha sacado el alumno en los dos primeros controles.
Si la media de los dos controles da un número mayor o igual a 5, el alumno
está aprobado y se mostrará la media. En caso de que la media sea un número
menor que 5, el alumno habrá tenido que hacer el examen de recuperación que
se califica como apto o no apto, por tanto se debe preguntar al usuario ¿Cuál
ha sido el resultado de la recuperación? (apto/no apto). Si el resultado
de la recuperación es apto, la nota será un 5; en caso contrario, se mantiene
la nota media anterior:

Ejemplo 1:
Nota del primer control: 7
Nota del segundo control: 10
Tu nota de Programación es 8.5

Ejemplo 2:
Nota del primer control: "7"
Nota del segundo control: 3
¿Cuál ha sido el resultado de la recuperación? (apto/no apto): apto
Tu nota de Programación es 5

Ejemplo 3:
Nota del primer control: 6
Nota del segundo control: 3
¿Cuál ha sido el resultado de la recuperación? (apto/no apto): no apto
Tu nota de Programación es 4.5

 */
package Ejemplo6;

import java.util.Scanner;
/**
 *
 * @author SebasTati
 */
public class EjemploJava6 {
    
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        
        double nota1, nota2, resultado;
        String Alumno;
        
        System.out.println("INGRESE SU NOMBRE: ");
        Alumno = teclado.nextLine();
        
System.out.println("==========================================");
System.out.println("=========== NOTAS TRICEMESTRE 1 ==========");
System.out.println("==========================================");

       Scanner leer = new Scanner(System.in); 

        System.out.println("Nota del primer control: ");
        nota1 = leer.nextDouble();
        
        System.out.println("Nota del segundo Control");
        nota2 = leer.nextDouble();
        
        resultado = (nota1 + nota2)/2;
        
        System.out.println("TU NOTA DE PROGRAMACION ES DE: " + resultado);
        
        
System.out.println("==========================================");
System.out.println("=========== NOTAS TRICEMESTRE 2 ==========");
System.out.println("==========================================");

        String Recuperacion1;

        Scanner entrada = new Scanner(System.in); 

        System.out.println("Nota del primer control: ");
        nota1 = entrada.nextDouble();
        
        System.out.println("Nota del segundo Control");
        nota2 = entrada.nextDouble();
        
        resultado = (nota1 + nota2)/2;
        
        System.out.println("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
        Recuperacion1 = teclado.nextLine();
        
        System.out.println("TU NOTA DE PROGRAMACION ES DE: " + resultado);
        
System.out.println("==========================================");
System.out.println("=========== NOTAS TRICEMESTRE 3 ==========");
System.out.println("==========================================");

        String Recuperacion2;

        Scanner Entrada = new Scanner(System.in); 

        System.out.println("Nota del primer control: ");
        nota1 = Entrada.nextDouble();
        
        System.out.println("Nota del segundo Control");
        nota2 = Entrada.nextDouble();
        
        resultado = (nota1 + nota2)/2;
        
        System.out.println("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
        Recuperacion2 = teclado.nextLine();
        
        System.out.println("TU NOTA DE PROGRAMACION ES DE: " + resultado);
        
    }
    
}
