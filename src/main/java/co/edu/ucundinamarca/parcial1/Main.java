
package co.edu.ucundinamarca.parcial1;

import java.util.Scanner;

/**
 * Clase Principal
 * @author handresortiz
 */
public class Main {



    public static void main(String[] args) {
       lista listita =new lista();
        Scanner teclado= new Scanner(System.in);
        int opcion=0;
       do{
           System.out.println( "\n Elija una opcion");
           System.out.println( "\n 1. Ingresar un nodo");
           System.out.println( "\n 2. Mostrar la lista");
           System.out.println( "\n 3. Buscar número de veces de un dato en la lista");
           System.out.println( "\n 4. Buscar Dato mayor");
           System.out.println( "\n 5. Mostrar tamaño lista");
           System.out.println( "\n 6. Salir");
           opcion=teclado.nextInt();

           switch (opcion){
               case 1:
                   System.out.println( "\n Ingrese un dato");
                   int dato=teclado.nextInt();
                   listita.ingresar(dato);
                   break;
               case 2:
                   System.out.println( "\n Mostrar lista");
                   listita.mostrar();
                   break;
               case 3:
                   System.out.println("\n Buscar");
                   System.out.println("\n Ingrese un dato a buscar");
                   int dato3=teclado.nextInt();
                   listita.buscar(dato3);
                   break;
               case 4:
                   listita.mayor();
                   break;
               case 5:
                   listita.tamaño();

           }

       }while(opcion!=6);
    }

}
