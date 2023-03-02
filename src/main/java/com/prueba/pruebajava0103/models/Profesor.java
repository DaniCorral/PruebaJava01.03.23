package com.prueba.pruebajava0103.models;

public class Profesor extends Persona{
    public String materiaQueImparte;

    
    public Profesor() {
        super();
    }

    public Profesor(String nombre, String rut, String materiaQueImparte) {
        super(nombre, rut);
        this.materiaQueImparte = materiaQueImparte;
    }

    public String getMateriaQueImparte() {
        return materiaQueImparte;
    }

    public void setMateriaQueImparte(String materiaQueImparte) {
        this.materiaQueImparte = materiaQueImparte;
    }

    @Override
    public String toString() {
        return super.toString() + "Profesor [materiaQueImparte=" + materiaQueImparte + "]";
    }

    
    
    
}
