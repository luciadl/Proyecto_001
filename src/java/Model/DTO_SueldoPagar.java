/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Lucia
 */
public class DTO_SueldoPagar {
    private String nombre;
    private float sueldoPagar;

    public DTO_SueldoPagar(String nombre, float sueldoPagar) {
        this.nombre = nombre;
        this.sueldoPagar = sueldoPagar;
    }

    public DTO_SueldoPagar(float sueldoPagar) {
        this.sueldoPagar = sueldoPagar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSueldoPagar() {
        return sueldoPagar;
    }

    public void setSueldoPagar(float sueldoPagar) {
        this.sueldoPagar = sueldoPagar;
    }

    @Override
    public String toString() {
        return "DTO_SueldoPagar{" + "nombre=" + nombre + ", sueldoPagar=" + sueldoPagar + '}';
    }
    
    
    
}
