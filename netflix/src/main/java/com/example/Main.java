package com.example;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Pelicula[] peliculasArray = new Pelicula[5];
        Serie[] seriesArray = new Serie[5];

        peliculasArray[0] = new Pelicula("Cars", "Pixar");
        peliculasArray[1] = new Pelicula("Toy Story", "Pixar");
        peliculasArray[2] = new Pelicula("Aladdin", "Infantil", "Disney", 19014, 1990);
        peliculasArray[3] = new Pelicula("Shrek", "Comedia", "Dreamworks", 26789, 2001);
        peliculasArray[4] = new Pelicula("Trolls", "Dreamworks");

        seriesArray[0] = new Serie("Orange is the New Black", "NTFLX");
        seriesArray[1] = new Serie("The Blacklist", "Drama", "NBC", 3605, 4);
        seriesArray[2] = new Serie("Scorpion", "Action", "CBS", 3890, 8);
        seriesArray[3] = new Serie("The Fall", "CBS");
        seriesArray[4] = new Serie("Narcos", "Drama", "NTFLX", 4750, 2);

        peliculasArray[2].marcarVisto();
        peliculasArray[3].marcarVisto();

        seriesArray[1].marcarVisto();
        seriesArray[2].marcarVisto();
        seriesArray[4].marcarVisto();

        int mayorAño = peliculasArray[1].getAño();
        int peliculaMasReciente = 1;

        for (int i = 0; i < peliculasArray.length; i++) {

            if (peliculasArray[i].esVisto()) {
                System.out.println("Pelicula vista: " + peliculasArray[i].getTitulo() + " - " + peliculasArray[i].tiempoVisto());
            }

            if (peliculasArray[i].getAño() > mayorAño){
                peliculaMasReciente = i;
            }
        }

        int masTemporadas = seriesArray[1].getTemporadas();
        int serieConMasTemporadas = 1;

        for (int i = 0; i < seriesArray.length; i++) {

            if (seriesArray[i].esVisto()) {
                System.out.println("Serie vista: " + seriesArray[i].getTitulo() + " - " + seriesArray[i].tiempoVisto());
            }

            if (seriesArray[i].getTemporadas() > masTemporadas){
                serieConMasTemporadas = i;
            }
        }

        System.out.println("Pelicula más reciente: " + peliculasArray[peliculaMasReciente].toString());
        System.out.println("Serie con más temporadas: " + seriesArray[serieConMasTemporadas].toString());

    }
}
