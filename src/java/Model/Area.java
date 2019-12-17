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
public class Area {
    
  private int idArea;
  private String denominacion;

    public Area(int idArea, String denominacion) {
        this.idArea = idArea;
        this.denominacion = denominacion;
    }

    public Area(String denominacion) {
        this.denominacion = denominacion;
    }

    public int getIdArea() {
        return idArea;
    }

    public void setIdArea(int idArea) {
        this.idArea = idArea;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    @Override
    public String toString() {
        return "Area{" + "idArea=" + idArea + ", denominacion=" + denominacion + '}';
    }
  
  
}
