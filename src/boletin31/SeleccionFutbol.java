/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin31;

/**
 *
 * @author fojomars
 */
public abstract class SeleccionFutbol implements IntegranteSeleccionFutbol {
    protected Integer id;
    protected String nombre;
    protected String apellidos;
    protected Integer edad;

    public SeleccionFutbol() {
    }

    public SeleccionFutbol(Integer id, String nombre, String apellidos, Integer edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad;
    }
    
    public void entrevista(){};
    
    public void planificarEntrenamiento(){};
    
    public void darMasaje(){};
    
    public void seleccionarJugador(){};
}
