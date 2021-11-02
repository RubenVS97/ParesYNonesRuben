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

        System.out.println("Elija si prefiere pares o nones (Jugador 1) \n 1- Par \n 2-Nones");
        opcion = t.nextInt();
        //switch para elegir si prefieres pares o nones 
        switch (opcion) {
            case 1:
                System.out.println("Ha elegido pares");
                //do while para filtrar el número de dedos 
                do {
                    System.out.println("Jugador 1 introduzca el número de dedos deseados");
                    dedos1 = t.nextInt();
                } while (!(dedos1 > 1 && dedos1 < 10));

                System.out.println("La máquina está creando el número");
                dedos2 = r.nextInt(10) + 1;
                System.out.println("El número es: " + dedos2);

                //if para saber quien ha ganado la partida
                if ((dedos1 + dedos2) % 2 == 0) {
                    System.out.println("Jugador 1 ha ganado la partida");
                } else {
                    System.out.println("Jugador 2 ha ganado la partida");
                }
                break;
            case 2:
                System.out.println("Ha elegido nones");
                do {
                    System.out.println("Jugador 1 introduzca el número de dedos deseados");
                    dedos1 = t.nextInt();
                } while (!(dedos1 > 1 && dedos1 < 10));

                System.out.println("La máquina está creando el número");
                dedos2 = r.nextInt(10) + 1;
                System.out.println("El número es: " + dedos2);
                if (!((dedos1 + dedos2) % 2 == 0)) {
                    System.out.println("Jugador 1 ha ganado la partida");
                } else {
                    System.out.println("Jugador 2 ha ganado la partida");
                }
                break;
        }

    }

}
