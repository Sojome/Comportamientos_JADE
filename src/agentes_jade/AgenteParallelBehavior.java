/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentes_jade;

import Comportamientos.MyParallelBehavior.*;
import jade.core.Agent;
import jade.core.behaviours.ParallelBehaviour;

/**
 *
 * @author Aaron Jaramillo
 */
public class AgenteParallelBehavior extends Agent {

    public void setup() {
        //-gui -port 1098 tonto1:agentes_jade.AgenteParallelBehavior
        ParallelBehaviour sb = new ParallelBehaviour(ParallelBehaviour.WHEN_ALL);
        sb.addSubBehaviour(new MyBehaviour(1, 3));
        sb.addSubBehaviour(new MyBehaviour(2, 4));
        sb.addSubBehaviour(new MyBehaviour(3, 2));
        addBehaviour(sb);
    }

    protected void takeDown() {
        System.out.println("Ejecucion finalizada");
    }
    
}
