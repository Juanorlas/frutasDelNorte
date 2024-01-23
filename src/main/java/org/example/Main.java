package org.example;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner leerDato = new Scanner(System.in);

        String nombreFruta;
        Boolean temporada=true;
        Integer costoCarga;

        System.out.print("Ingresa el nombre de la fruta: ");
        nombreFruta = leerDato.nextLine();

        System.out.print("Esta en temporada?: ");
        temporada = leerDato.nextBoolean();

        if (temporada){
            System.out.println("La fruta es Colombiana?: ");
            boolean esColombiana=leerDato.nextBoolean();
            if (esColombiana){
                costoCarga=100000;
                System.out.println("El costo es: $"+costoCarga);
            }else {
                costoCarga=200000;
                System.out.println("El costo es: $"+costoCarga);
            }

        }else {
            costoCarga=350000;
            System.out.println("El costo es: $"+costoCarga);
        }

    }
}