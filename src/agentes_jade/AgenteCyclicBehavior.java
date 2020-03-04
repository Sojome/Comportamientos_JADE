/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentes_jade;

import Comportamientos.MyCyclicBehavior;
import jade.core.Agent;

/**
 *
 * @author Aaron Jaranillo
 */
public class AgenteCyclicBehavior extends Agent {

    public void setup() {
        //Instancia el comportamiento
        MyCyclicBehavior c = new MyCyclicBehavior();
        addBehaviour(c);
    }

    protected void takeDown() {
        System.out.println("Ejecucion finalizada");
    }
    
}
