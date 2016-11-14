package com.example;

public class Pelicula extends Netflix {

    private int año;

    public Pelicula() {
    }

    public Pelicula(String titulo, String creador) {
        super(titulo, creador);
    }

    public Pelicula(String titulo, String genero, String creador, int duracion, int año) {
        super(titulo, genero, creador, duracion);
        this.año = año;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return getTitulo() + " - " + getAño() + " - " + getCreador() + " - " + getGenero() + " - " + tiempoVisto();
    }
}

