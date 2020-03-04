/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comportamientos;

import jade.core.behaviours.OneShotBehaviour;

/**
 *
 * @author Aaron Jaramillo
 */
public class MySequentialBehavior {
    public static class OneShot extends OneShotBehaviour {
        public int id=0;
        public OneShot(int arg){
            this.id=arg;
        }
        
        public void action(){
            System.out.println("Ejecutando Comportamiento "+id);
        }
    }
}
