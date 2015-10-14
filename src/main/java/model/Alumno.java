/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 * @JovannyCk
 */
public class Alumno {
    private Materia Materia;
    private String nombre;
    private int cuneta ;

    public Alumno() {
    }

    public Materia getMateria() {
        return Materia;
    }

    public void setMateria(Materia Materia) {
        this.Materia = Materia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCuneta() {
        return cuneta;
    }

    public void setCuneta(int cuneta) {
        this.cuneta = cuneta;
    }
    
}
