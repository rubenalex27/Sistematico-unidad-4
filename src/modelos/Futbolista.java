/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author 50578
 */
public class Futbolista extends SeleccionFutbol {
    private String demarcacion;
    private int dorsal;

    public Futbolista() {
    }

    public Futbolista(String demarcacion, int dorsal, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.demarcacion = demarcacion;
        this.dorsal = dorsal;
    }

    @Override
    public String toString() {
        return "Futbolista{" + "demarcacion=" + demarcacion + ", dorsal=" + dorsal + '}';
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }
    
    
           
}
