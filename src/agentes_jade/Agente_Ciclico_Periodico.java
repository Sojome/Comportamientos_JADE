/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agentes_jade;

import Comportamientos.MyCiclico_Periodico.*;
import jade.core.Agent;
import jade.core.behaviours.*;

/**
 *
 * @author Aaron Jaramillo
 */

public class Agente_Ciclico_Periodico extends Agent {

    long tini;

    protected void setup() {
        //-gui -port 1098 tonto1:agentes_jade.Comportamiento_Ciclico_Periodico_Tarea
        tini = System.currentTimeMillis();
        addBehaviour(new miTicker(this, 1000));
    }

}
