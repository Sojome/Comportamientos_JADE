/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentes_jade;

import Comportamientos.MyFsmBehavior.*;
import jade.core.Agent;
import jade.core.behaviours.FSMBehaviour;

/**
 *
 * @author Aaron Jaramillo
 */

public class AgenteFsmBehavior extends Agent {
    // State names
    private static final String STATE_A = "A";
    private static final String STATE_B = "B";
    private static final String STATE_C = "C";
    private static final String STATE_D = "D";
    private static final String STATE_E = "E";
    private static final String STATE_F = "F";
   
    protected void setup() {
        FSMBehaviour fsm = new FSMBehaviour(this) {
            public int onEnd() {
                System.out.println("FSM behaviour completed.");
                myAgent.doDelete();
                return super.onEnd();
            }
        };      
       
        // Register state A (first state)
        fsm.registerFirstState(new NamePrinter(), STATE_A);
       
        // Register state B
        fsm.registerState(new NamePrinter(), STATE_B);
       
        // Register state C
        fsm.registerState(new RandomGenerator(3), STATE_C);
       
        // Register state D
        fsm.registerState(new NamePrinter(), STATE_D);
       
        // Register state E
        fsm.registerState(new RandomGenerator(4), STATE_E);
       
        // Register state F (final state)
        fsm.registerLastState(new NamePrinter(), STATE_F);

        // Register the transitions
        fsm.registerDefaultTransition(STATE_A, STATE_B);
        fsm.registerDefaultTransition(STATE_B, STATE_C);
        fsm.registerTransition(STATE_C, STATE_C, 0);
        fsm.registerTransition(STATE_C, STATE_D, 1);
        fsm.registerTransition(STATE_C, STATE_A, 2);
        fsm.registerDefaultTransition(STATE_D, STATE_E);
        fsm.registerTransition(STATE_E, STATE_F, 3);
        fsm.registerDefaultTransition(STATE_E, STATE_B);
       
        addBehaviour(fsm);
    }
   
}
