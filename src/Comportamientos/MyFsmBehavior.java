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
public class MyFsmBehavior {
    /**
       Inner class NamePrinter.
       This behaviour just prints its name
     */
    public static class NamePrinter extends OneShotBehaviour {
        public void action() {
            System.out.println("Executing behaviour "+getBehaviourName());
        }
    }
    /**
       Inner class RandomGenerator.
      
       Este comportamiento imprime su nombre y sale con un valor aleatorio
       entre 0 y un valor entero dado
     */
    public static class RandomGenerator extends NamePrinter {
        private int maxExitValue;
        private int exitValue;
       
        public RandomGenerator(int max) {
            super();
            maxExitValue = max;
        }
       
        public void action() {
            System.out.println("Executing behaviour "+getBehaviourName());
            exitValue = (int) (Math.random() * maxExitValue);
            System.out.println("Exit value is "+exitValue);
        }
       
        public int onEnd() {
            return exitValue;
        }
    }
    
    public void ejemplo(){
        
    }
}
