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
//DTO_extra Lista el nombre del empleado, el area a la que pertenece y el año en el que ingreso
public class DTO_extra {
    private String nombre;
    private String denominacion;
    private int ingreso;

    public DTO_extra(String nombre, String denominacion, int ingreso) {
        this.nombre = nombre;
        this.denominacion = denominacion;
        this.ingreso = ingreso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public int getIngreso() {
        return ingreso;
    }

    public void setIngreso(int ingreso) {
        this.ingreso = ingreso;
    }

    @Override
    public String toString() {
        return "DTO_extra{" + "nombre=" + nombre + ", denominacion=" + denominacion + ", ingreso=" + ingreso + '}';
    }
      
}
