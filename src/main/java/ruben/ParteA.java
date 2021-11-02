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
        
        int numero1, numero2, opcion;
        Scanner t = new Scanner(System.in);
        boolean pares, nones;
        
        System.out.println("Elija si prefiere pares o nones (Jugador 1) \n 1- Par \n 2-Nones");
        opcion = t.nextInt();
        
        switch(opcion){
            case 1:
                System.out.println("Ha elegido pares");
                System.out.println("Jugador 1 introduzca el número de dedos deseados");
                numero1 = t.nextInt();
                break;
            case 2:
                System.out.println("Ha elegido nones");
                System.out.println("Jugador 1 introduzca el número de dedos deseados");
                numero1 = t.nextInt();
                break;
        }
    }
    
}
