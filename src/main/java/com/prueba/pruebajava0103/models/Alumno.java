package com.prueba.pruebajava0103.models;

public class Alumno extends Persona{
    public Double nota;

    public Alumno() {
        super();
    }

    public Alumno(String nombre, String rut, Double nota) {
        super(nombre, rut);
        this.nota = nota;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return super.toString() +  "Alumno [nota=" + nota + "]";
    }

    

    

}
