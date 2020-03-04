/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comportamientos;

import jade.core.behaviours.Behaviour;

/**
 *
 * @author Aaron Jaramillo
 */
public class MyParallelBehavior {
    public static class MyBehaviour extends Behaviour {
        public int id, cycle, currentcycle;
        public MyBehaviour(int a_id, int a_cycle){
            this.id=a_id;
            this.cycle=a_cycle;
            this.currentcycle=0;
        }
        
        public void action(){
            System.out.println("Comportamiento "+id+" ejecutando ciclo "+ ++currentcycle);
        }
        
        public boolean done(){
            return(currentcycle==cycle);
        }
    }
}
