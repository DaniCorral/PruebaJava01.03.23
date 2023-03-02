package com.prueba.pruebajava0103.models;

public class Curso {
    public String nombre;
    public String alumnos;
    
    public Curso() {
    }

    public Curso(String nombre, String alumnos) {
        this.nombre = nombre;
        this.alumnos = alumnos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "Curso [nombre=" + nombre + ", alumnos=" + alumnos + "]";
    }

    

    
    
}
