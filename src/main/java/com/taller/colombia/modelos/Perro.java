package com.taller.colombia.modelos;

public class Perro {

    private String nombre;
    private String raza;
    private String color;
    private String apodo;

    public Perro(String nombre, String raza, String color, String apodo) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.apodo = apodo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }
}

