
package co.edu.ucundinamarca.parcial1_1;

import co.edu.ucundinamarca.parcial1.lista;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase Principal
 * @author handresortiz
 */
public class Main {


    public static void main(String[] args) {
        int n, nas, nan;
        String nom;
        String nm;
        ArrayList Soldados = new ArrayList();
        Scanner sc = new Scanner(System.in);
        System.out.println(" Ingrese el numero de soldados");
        n = sc.nextInt();
        nas = (int) (Math.random() * n + 1);

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el nombre del soldado");
            nm = sc.next();
            Soldados.add(nm);

        }
        for (int i = 0; i < n; i++) {
            if (nas == i) {
                System.out.println("El soldado es "+Soldados.get(i));
            }
        }
        nan = (int) (Math.random() * n + 1);
        System.out.println("El número es"+nan);
        int tot=nas+nan-2;
        do {
            if(tot<n){
                Soldados.remove(tot);
                n--;
                tot=n+nan;

            }
            if(tot>n){

                    tot = tot - n;
                    n--;
                    if(n<nan){
                        tot=tot-nan;
                        Soldados.remove(tot);
                    }else{
                        Soldados.remove(tot);
                        tot = n + nan;

                    }
                }

        }while (n != 0) ;
        System.out.println("El soldado  sobreviviente es "+Soldados.get(0));


    }}


