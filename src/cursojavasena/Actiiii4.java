//Se necesita recibir la información de las notas para los estudiantes de 
//tres materias y una vez obtenidas, calcular el promedio del grupo por materia.

package cursojavasena;

import java.util.Scanner;


public class Actiiii4 {
    public static void main(String[] args) {
        
        int ests, cont = 0, sumMat = 0, sumEsp = 0, sumIng = 0, clase;
        float promMat, promEsp, promIng;
        
        //QUE MATERIA NECESITA
        System.out.println("1 = Matematicas, 2 = Espanol, 3 = Ingles");
        System.out.print("¿Que materia desea promediar?: ");
        Scanner materia = new Scanner(System.in);
        clase = materia.nextInt();
        
        //CUANTAS VECES DESEA REPETIR EL CICLO
        Scanner est = new Scanner(System.in);
        System.out.print("Cuantos estudiantes desea promediar?: ");
        ests = est.nextInt();
        
        switch(clase){
        
            case 1:
                
                //LEE NOTAS DE MATEMATICAS
                System.out.println("\nNotas de Matematicas: ");
                for (int i = 0; i < ests; i++) {
                    System.out.print("Estudiante " + (i+1) + ": ");
                    Scanner mat = new Scanner(System.in);            
                    sumMat += mat.nextInt();
                }
                promMat = sumMat / ests;
                //MUESTRA PROMEDIO
                System.out.println("\nEl promedio de matematicas es: " + promMat);
                break;
                
            case 2:
                
                //LEE NOTAS DE ESPAÑOL
                System.out.println("\nNotas de Español: ");
                while(cont < ests){
                    System.out.print("Estudiante " + (cont+1) + ": ");
                    Scanner esp = new Scanner(System.in);
                    sumEsp += esp.nextInt();
                    cont++;
                }
                //cont=0;
                promEsp = sumEsp / ests;
                //MUESTRA PROMEDIO
                System.out.println("El promedio de español es: " + promEsp);
                break; 
                
            case 3: 
                //LEE NOTAS DE INGLES
                System.out.println("\nNotas de Ingles: ");
                do{
                    System.out.print("Estudiante " + (cont+1) + ": ");
                    Scanner ing = new Scanner(System.in);
                    sumIng += ing.nextInt();
                    cont++;
                } while(cont < ests);
                promIng = sumIng / ests;
                //MUESTRA PROMEDIO
                System.out.println("El promedio de ingles es: " + promIng);
                break;
        }
    }
}