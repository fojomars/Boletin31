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
public class EntrenadorHM extends SeleccionFutbolHM implements IntegranteInterface, DeportistaInterface {
    
    private Integer idFederacion;

    @Override
    public void concentrarse() {
        System.out.println("El entrenador se concentra.");
    }

    @Override
    public void viajar() {
        System.out.println("El entrenador viaja.");
    }

    @Override
    public void entrenar() {
        System.out.println("El entrenador hace un entrenamiento.");
    }

    @Override
    public void jugarPartido() {
        System.out.println("El entrenador administra un partido.");
    }

    public EntrenadorHM() {
    }

    public EntrenadorHM(Integer idFederacion, Integer id, String nombre, String apellidos, Integer edad) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    public Integer getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(Integer idFederacion) {
        this.idFederacion = idFederacion;
    }

    @Override
    public String toString() {
        return super.toString() + ", idFederacion=" + idFederacion;
    }
}

