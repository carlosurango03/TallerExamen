package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leerdato = new Scanner(System.in);
        double distancia;
        double valorGasolina = 5000 ;
        double gastodeGasolinaPor100KM;

        System.out.println(" El listro de gasolina esta a $5000");

        System.out.println(" cuanto listros se gasta por cada 100 kilometros");

        gastodeGasolinaPor100KM = leerdato.nextDouble();
        double valorgasolinaGastada = gastodeGasolinaPor100KM*valorGasolina;


        System.out.println( " Diga el recorrido  que vas a recorrer en km");
        distancia = leerdato.nextDouble();

        double estimado = distancia*valorgasolinaGastada/100;


        System.out.println(" La cantidad de gasolina que necesita comprar para el recorrido es de "+estimado);















    }
}