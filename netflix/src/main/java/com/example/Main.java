package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {

    //Definimos los ArrayList de películas y series y agregamos elementos en cada una de ellas

        ArrayList <Pelicula> peliculas = new ArrayList<Pelicula>();
        peliculas.add(new Pelicula("Cars", "Pixar"));
        peliculas.add(new Pelicula("Toy Story", "Pixar"));
        peliculas.add(new Pelicula("Aladdin", "Infantil", "Disney", 19014, 1990));
        peliculas.add(new Pelicula("Shrek", "Comedia", "Dreamworks", 26789, 2001));
        peliculas.add(new Pelicula("Trolls", "Dreamworks"));

        ArrayList <Serie> series = new ArrayList<Serie>();
        series.add(new Serie("Orange is the New Black", "NTFLX"));
        series.add(new Serie("The Blacklist", "Drama", "NBC", 3605, 4));
        series.add(new Serie("Scorpion", "Action", "CBS", 3890, 8));
        series.add(new Serie("The Fall", "CBS"));
        series.add(new Serie("Narcos", "Drama", "NTFLX", 4750, 2));

    //Aquí podría haber errores por lo que se agregó un try
        try {

            //en esta sección se marcan como visto las películas y/o series, y la función captura la duración total de éstas
            peliculas.get(2).marcarVisto();
            peliculas.get(3).marcarVisto();

            series.get(1).marcarVisto();
            series.get(2).marcarVisto();
            series.get(4).marcarVisto();
            series.get(15).marcarVisto(); //esta línea fue agregada como error para probar el funcionamiento de esta parte

        } catch (Exception e) {
            System.out.println("Ha ocurrido el siguiente error: ");
            e.printStackTrace();

        } finally {
            System.out.println(":)");
        }

      //Se realizaron operaciones para determinar la película y serie más vista
        int mayorAño = peliculas.get(1).getAño();
        int peliculaMasReciente = 1;

        for (int i = 0; i < peliculas.size(); i++) {

            if (peliculas.get(i).esVisto()) {
                System.out.println("Pelicula vista: " + peliculas.get(i).getTitulo() + " - " + peliculas.get(i).tiempoVisto());
            }

            if (peliculas.get(i).getAño() > mayorAño){
                peliculaMasReciente = i;
            }
        }

        int masTemporadas = series.get(1).getTemporadas();
        int serieConMasTemporadas = 1;

        for (int i = 0; i < series.size(); i++) {

            if (series.get(i).esVisto()) {
                System.out.println("Serie vista: " + series.get(i).getTitulo() + " - " + series.get(i).tiempoVisto());
            }

            if (series.get(i).getTemporadas() > masTemporadas){
                serieConMasTemporadas = i;
            }
        }

        //El sistema imprime la película y serie más vistas
        System.out.println("Pelicula más reciente: " + peliculas.get(peliculaMasReciente).toString());
        System.out.println("Serie con más temporadas: " + series.get(serieConMasTemporadas).toString());


/*
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
*/
    }
}
