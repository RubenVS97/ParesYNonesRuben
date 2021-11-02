/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ruben;

import java.util.Scanner;

/**
 *
 * @author ruben
 */
public class ParteA {

    public static void main(String[] args) {

        int dedos1, dedos2, opcion;
        Scanner t = new Scanner(System.in);
        String nombre1, nombre2;

        System.out.println("Elija si prefiere pares o nones (Jugador 1) \n 1- Par \n 2-Nones \n 3-Salir");
        opcion = t.nextInt();
        //switch para elegir si prefieres pares o nones
        do {
            switch (opcion) {
                case 1:
                    System.out.println("Ha elegido pares");
                    //do while para filtrar el número de dedos 
                    t.nextLine();
                    System.out.println("¿Jugador 1 como te llamas?");
                    nombre1 = t.nextLine();
                    do {
                        System.out.println(nombre1 + " introduce el número de dedos deseados");
                        dedos1 = t.nextInt();
                    } while (!(dedos1 > 1 && dedos1 < 10));

                    t.nextLine();
                    System.out.println("¿Jugador 2 como te llamas?");
                    nombre2 = t.nextLine();
                    do {
                        System.out.println(nombre2 + " introduce el número de dedos deseados");
                        dedos2 = t.nextInt();
                    } while (!(dedos2 > 1 && dedos2 < 10));
                    //if para saber quien ha ganado la partida
                    if ((dedos1 + dedos2) % 2 == 0) {
                        System.out.println(nombre1 + " ha ganado la partida");
                    } else {
                        System.out.println(nombre2 + " ha ganado la partida");
                    }
                    break;
                case 2:
                    System.out.println("Ha elegido nones");
                    t.nextLine();
                    System.out.println("¿Jugador 1 como te llamas?");
                    nombre1 = t.nextLine();
                    do {
                        System.out.println(nombre1 + "introduce el número de dedos deseados");
                        dedos1 = t.nextInt();
                    } while (!(dedos1 > 1 && dedos1 < 10));
                    t.nextLine();
                    System.out.println("¿Jugador 2 como te llamas?");
                    nombre2 = t.nextLine();
                    do {
                        System.out.println(nombre2 + " introduce el número de dedos deseados");
                        dedos2 = t.nextInt();
                    } while (!(dedos2 > 1 && dedos2 < 10));
                    if (!((dedos1 + dedos2) % 2 == 0)) {
                        System.out.println(nombre1 + " ha ganado la partida");
                    } else {
                        System.out.println(nombre2 + " ha ganado la partida");
                    }
                    break;
                case 3:
                    System.out.println("Ha seleccionado salir");
                    break;
            }
        } while (opcion != 3);

    }

}
