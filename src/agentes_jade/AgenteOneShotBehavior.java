/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentes_jade;

import Comportamientos.MyOneShotBehavior;
import jade.core.Agent;

/**
 *
 * @author Aaron Jaramillo
 */
public class AgenteOneShotBehavior extends Agent {

    public void setup() {
        MyOneShotBehavior c = new MyOneShotBehavior();
        addBehaviour(c);
    }

    protected void takeDown() {
        System.out.println("Ejecucion finalizada");
    }
    
}
