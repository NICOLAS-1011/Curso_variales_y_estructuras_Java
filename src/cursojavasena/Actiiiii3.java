
package cursojavasena;

import java.util.Scanner;
import java.lang.Math;


public class Actiiiii3 {
    public static void main(String[] args) {
        
        double a, b, c;
        String tipo;

        Scanner uno = new Scanner(System.in);
        System.out.print("Ingrese el lado a: ");
        a = uno.nextInt();
        
        Scanner dos = new Scanner(System.in);
        System.out.print("Ingrese el lado b: ");
        b = dos.nextInt();
        
        Scanner tres = new Scanner(System.in);
        System.out.print("Ingrese el lado c: ");
        c = tres.nextInt();        

        
        if(a == b && a == c && b == c){
            tipo = "equi";
            System.out.println("\nTIENES UN TRIANGULO EQUILATERO");
        } else if(a != b && a != c && b != c){
            tipo = "esc";
            System.out.println("\nTIENES UN TRIANGULO ESCALENO");
        } else {
            tipo = "iso";
            System.out.println("\nTIENES UN TRIANGULO ISOCELES");
        }
        
        switch(tipo){
            case "equi":
                System.out.println("\nTodos los angulos tienen 60°");
                
                double areas = (a*a) * Math.sqrt(3) / 4;
                System.out.println("El area del equilatero es de: " + areas);
                
                break;
            default: //ME DÍ CUENTA QUE SERVIA EL MISMO PROCEDIMIENTO PARA ISOCELES Y ESCALENOS**
                //AQUI SACAMOS COSENO DE A
                double cosA = (a*a - b*b - c*c) / (-2 * b *c);                    
                double gradoA = Math.toDegrees(Math.acos(cosA));
                System.out.println("\nEl angulo de A es: " + gradoA);
                    
                //AQUI SACAMOS EL SENO DE B
                double senB = b * Math.sin(Math.toRadians(gradoA)) / a ;
                double gradoB = Math.toDegrees(Math.asin(senB));
                System.out.println("El angulo de B es: " + gradoB);
                
                //AQUI SACAREMOS EL SENO DE C
                double senC = c * Math.sin(Math.toRadians(gradoA)) / a;
                double gradoC = Math.toDegrees(Math.asin(senC));
                System.out.println("El angulo de C es "+ gradoC);
                
                System.out.println("EL TOTAL DE GRADOS ES = " + (gradoA + gradoB + gradoC));
                
                double altur = b * Math.sin(Math.toRadians(gradoC));
                //System.out.println("\nLA ALTURA DEL TRIANGULO ES DE: " + altur);
                
                double area = a * altur / 2;
                System.out.println("\nEL AREA DEL TRIANGULO ES: " + area);
                break;
        }
    }
}
