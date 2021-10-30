package co.edu.ucundinamarca.parcial1;

import java.util.Scanner;

public class lista {
    nodo primero;
    nodo ultimo;
    int contador=0;
    Scanner teclado= new Scanner(System.in);
    int dato;
    public lista(){
        primero= null;
        ultimo=null;

    }
    public void ingresar(int x) {
        nodo nuevo = new nodo();
        nuevo.datos = x;
        contador++;
        if (primero == null) {
            primero = nuevo;
            primero.siguiente = primero;
            primero.anterior = ultimo;
            ultimo = nuevo;

        } else {
            ultimo.siguiente = nuevo;
            nuevo.siguiente = primero;
            ultimo = nuevo;
            primero.anterior = ultimo;
        }
    }
        public void mostrar (){
            nodo actual= new nodo();
            actual=primero;
            do{
                System.out.println(actual.datos);
                actual=actual.siguiente;
            }while (actual!=primero);
        }
        public void buscar(int x) {
            nodo actual= new nodo();
            actual=primero;
            int cont=0;int contd=0;
            boolean encontrado =false;
            for(int i=0;cont<contador;i++){

                   if (actual.datos == x) {
                       cont++;
                       contd++;
                       encontrado = true;
                       dato = actual.datos;

                   }
                   if (actual.datos != x) {
                       cont++;
                       encontrado = false;
                       contd=contd;
                   }
                actual=actual.siguiente;
               }

            if(contd>0) {
                System.out.println(dato+" dato encontrado "+contd+" veces");

            }if(contd==0){
                System.out.println("dato no encontrado");
            }

        }
    public void mayor() {
        nodo actual= new nodo();
        actual=primero;
        int cont=0; int mayor=0;
        for(int i=0;cont<contador;i++){

            if (actual.datos >mayor) {
                cont++;
                mayor= actual.datos;

            }
            if (actual.datos < mayor) {
                cont++;
               mayor=mayor;
            }
            actual=actual.siguiente;
        }
        System.out.println("El dato mayor es "+mayor);

    }
    public void tamaño(){
        System.out.println(contador);
    }

    }

