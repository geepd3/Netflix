package com.example;

public class Serie extends Netflix {

    private int temporadas = 1;

    public Serie() {
    }

    public Serie(String titulo, String creador) {
        super(titulo, creador);
    }

    public Serie(String titulo, String genero, String creador, int duracion, int temporadas) {
        super(titulo, genero, creador, duracion);
        this.temporadas = temporadas;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    @Override
    public String toString() {
        return getTitulo() + " - " + getTemporadas() + " - " + getCreador() + " - " + getGenero() + " - " + tiempoVisto();
    }
}
