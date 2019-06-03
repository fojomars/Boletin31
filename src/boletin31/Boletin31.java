/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin31;

import java.util.ArrayList;

/**
 *
 * @author fojomars
 */
public class Boletin31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<SeleccionFutbol> lista = new ArrayList<>();
        SeleccionFutbol f1 = new Futbolista(7,"Delantero",152,"Cristiano","Ronaldo",35);
        Futbolista f2 = new Futbolista(8,"Delantero",131,"Leo","Messi",33);
        SeleccionFutbol e1 = new Entrenador(121,36,"Juan","Martínez",48);
        SeleccionFutbol m1 = new Masajista("Profesional",20,172,"Marta","Sánchez",45);
        lista.add(f1);
        lista.add(f2);
        lista.add(e1);
        lista.add(m1);
        for (Object o : lista){
            System.out.println(o);
        }
    }
    
}
