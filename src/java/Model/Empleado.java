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
public class Empleado {
    private int idEmpleado;
    private float sueldoBasico;
    private int idArea;
    private String nombre;
    private int ingreso;

    public Empleado(int idEmpleado, float sueldoBasico, int idArea, String nombre, int ingreso) {
        this.idEmpleado = idEmpleado;
        this.sueldoBasico = sueldoBasico;
        this.idArea = idArea;
        this.nombre = nombre;
        this.ingreso = ingreso;
    }

    public Empleado(float sueldoBasico, int idArea, String nombre, int ingreso) {
        this.sueldoBasico = sueldoBasico;
        this.idArea = idArea;
        this.nombre = nombre;
        this.ingreso = ingreso;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public float getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(float sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public int getIdArea() {
        return idArea;
    }

    public void setIdArea(int idArea) {
        this.idArea = idArea;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIngreso() {
        return ingreso;
    }

    public void setIngreso(int ingreso) {
        this.ingreso = ingreso;
    }

    @Override
    public String toString() {
        return "Empleado{" + "idEmpleado=" + idEmpleado + ", sueldoBasico=" + sueldoBasico + ", idArea=" + idArea + ", nombre=" + nombre + ", ingreso=" + ingreso + '}';
    }

    
    
}
