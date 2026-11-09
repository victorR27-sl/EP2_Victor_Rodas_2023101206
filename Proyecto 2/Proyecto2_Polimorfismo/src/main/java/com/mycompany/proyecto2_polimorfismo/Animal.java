package com.mycompany.proyecto2_polimorfismo;

public abstract class Animal {
    protected String nombre;
    
    public Animal(String nombre){
        this.nombre = nombre;
    }
    
    
    public abstract void hacerSonido();
    
    public String getNombre() {
        return this.nombre;
    }
}