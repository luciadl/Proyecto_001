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
public class Reporte1 {
    private int cantidad;
    private float sueldo;
    private String area;

    public Reporte1(int cantidad, float sueldo, String area) {
        this.cantidad = cantidad;
        this.sueldo = sueldo;
        this.area = area;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Reporte1{" + "cantidad=" + cantidad + ", sueldo=" + sueldo + ", area=" + area + '}';
    }
    
    
    
}
