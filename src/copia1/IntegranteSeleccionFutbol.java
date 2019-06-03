/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copia1;

/**
 *
 * @author fojomars
 */
public interface IntegranteSeleccionFutbol {
    public void concentrarse();
    public void viajar();
    public void entrenar();
    public void jugarPartido();
    public default void ruedaPrensa(){
        System.out.println("Hay que dar una rueda de prensa");
    };
    public default void videoPublicitario(){
        System.out.println("Hay que realizar un video publicitario");
    };
}
