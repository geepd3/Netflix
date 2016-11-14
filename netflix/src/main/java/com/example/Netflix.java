package com.example;

public class Netflix implements Visualizable{

    private String titulo;
    private String genero;
    private String creador;
    private int duracion;
    private boolean visto;

    public Netflix() {
    }

    public Netflix(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
    }

    public Netflix(String titulo, String genero, String creador, int duracion) {
        this.titulo = titulo;
        this.genero = genero;
        this.creador = creador;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public String getCreador() {
        return creador;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public void marcarVisto() {
        this.visto = true;
    }

    @Override
    public boolean esVisto() {
        return this.visto;
    }

    @Override
    public String tiempoVisto() {

        int hours = duracion / 3600;
        int minutes = (duracion % 3600) / 60;
        int seconds = duracion % 60;

        String timeString = String.format(hours + ":" + minutes + ":" + seconds);

        return timeString;
    }
}
