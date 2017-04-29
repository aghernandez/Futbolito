package com.example.a28061.pachanga01;

/**
 * Created by 28061 on 22/04/2017.
 */

public class Jugador {

    private String nombre;
    private int foto;
    private int logo;
    private String linea1;
    private String linea2;
    private String linea3;

    public Jugador(String nombre, int foto, int logo, String linea1, String linea2, String linea3) {
        this.nombre = nombre;
        this.foto = foto;
        this.logo = logo;
        this.linea1 = linea1;
        this.linea2 = linea2;
        this.linea3 = linea3;
    }

    public String getNombre() {
        return nombre;
    }

    public int getFoto() {
        return foto;
    }

    public int getLogo() {
        return logo;
    }

    public String getLinea1() {
        return linea1;
    }

    public String getLinea2() {
        return linea2;
    }

    public String getLinea3() {
        return linea3;
    }
}
