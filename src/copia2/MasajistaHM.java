/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copia2;

import copia1.IntegranteSeleccionFutbol;

/**
 *
 * @author fojomars
 */
public abstract class MasajistaHM extends SeleccionFutbolHM implements IntegranteSeleccionFutbol{
    private String titulacion;
    private Integer aniosExperiencia;

    @Override
    public void concentrarse() {
        System.out.println("El masajista se concentra.");
    }

    @Override
    public void viajar() {
        System.out.println("El masajista viaja.");
    }

    public MasajistaHM() {
    }

    public MasajistaHM(String titulacion, Integer aniosExperiencia, Integer id, String nombre, String apellidos, Integer edad) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public Integer getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(Integer aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    @Override
    public String toString() {
        return super.toString() + ", titulacion=" + titulacion + ", aniosExperiencia=" + aniosExperiencia;
    }
}
