/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ruben;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ruben
 */
public class ParteB {

    public static void main(String[] args) {

        Random r = new Random();
        int dedos1, dedos2, opcion;
        Scanner t = new Scanner(System.in);
        String nombre1;
        System.out.println("Elija si prefiere pares o nones (Jugador 1) \n 1- Par \n 2-Nones \n 3-Salir");
        opcion = t.nextInt();
        //switch para elegir si prefieres pares o nones 
        do {
            switch (opcion) {
                case 1:
                    System.out.println("Ha elegido pares");
                    //Limpiamos buffer y pedimos el nombre del jugador por pantalla
                    t.nextLine();
                    System.out.println("¿Jugador 1 como te llamas?");
                    nombre1 = t.nextLine();
                    //do while para filtrar el número de dedos
                    do {
                        System.out.println(nombre1 + " introduce el número de dedos deseados");
                        dedos1 = t.nextInt();
                    } while (!(dedos1 > 1 && dedos1 < 10));
                    //Random para elegir un número aleatorio entre 1-10
                    System.out.println("La máquina está creando el número");
                    dedos2 = r.nextInt(10) + 1;
                    System.out.println("El número es: " + dedos2);

                    //if para saber quien ha ganado la partida, si la suma de ambas variables da 0 gana el jugador 1 si no el jugador 2 
                    if ((dedos1 + dedos2) % 2 == 0) {
                        System.out.println(nombre1 + " ha ganado la partida");
                    } else {
                        System.out.println("La máquina ha ganado la partida");
                    }
                    break;
                    //Lo mismo que el case 1 pero en este caso ha elegido nones
                case 2:
                    System.out.println("Ha elegido nones");
                    t.nextLine();
                    System.out.println("¿Jugador 1 como te llamas?");
                    nombre1 = t.nextLine();
                    do {
                        System.out.println(nombre1 + " introduce el número de dedos deseados");
                        dedos1 = t.nextInt();
                    } while (!(dedos1 > 1 && dedos1 < 10));
                    
                    System.out.println("La máquina está creando el número");
                    dedos2 = r.nextInt(10) + 1;
                    System.out.println("El número es: " + dedos2);
                    if (!((dedos1 + dedos2) % 2 == 0)) {
                        System.out.println(nombre1 + " ha ganado la partida");
                    } else {
                        System.out.println("La máquina ha ganado la partida");
                    }
                    break;
                    //case para salir
                case 3:
                    System.out.println("Ha seleccionado salir");
                    break;
            }
        } while (opcion != 3);

    }

}
