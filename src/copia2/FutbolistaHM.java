/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copia2;

/**
 *
 * @author fojomars
 */
public class FutbolistaHM extends SeleccionFutbolHM implements IntegranteInterface, DeportistaInterface {
    
    private Integer dorsal;
    private String demarcacion;

    public FutbolistaHM() {
    }

    public FutbolistaHM(Integer dorsal, String demarcacion, Integer id, String nombre, String apellidos, Integer edad) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public Integer getDorsal() {
        return dorsal;
    }

    public void setDorsal(Integer dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    @Override
    public String toString() {
        return super.toString() +  ", dorsal=" + dorsal + ", demarcacion=" + demarcacion;
    }

    @Override
    public void concentrarse() {
        System.out.println("El futbolista se concentra");
    }

    @Override
    public void viajar() {
        System.out.println("El futbolista viaja");
    }

    @Override
    public void entrenar() {
        System.out.println("El futbolista entrena");
    }

    @Override
    public void jugarPartido() {
        System.out.println("El futbolista juega un partido");
    }
    
}

