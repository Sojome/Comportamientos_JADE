/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comportamientos;

import jade.core.Agent;
import jade.core.behaviours.TickerBehaviour;

/**
 *
 * @author Aaron Jaramillo
 */
public class MyCiclico_Periodico {
    public static class miTicker extends TickerBehaviour {

        int minticks;
        private long tini;

        public miTicker(Agent a, long intervalo) {
            super(a, intervalo);
            minticks = 0;
        }

        public void reset() {
            super.reset();
            //minticks = 0;
            System.out.println("reseteo!");
        }

        protected void onTick() {
            long tfin = System.currentTimeMillis() - tini;
            int nticks = getTickCount(); // obtenemos el numero de ticks desde el último reset
            minticks++;
            if (nticks == 5) {
                System.out.println("[" + tfin + "ms.] tick = " + nticks + ", mitick =  " + minticks + " y reseteo");
                reset();
            } else {
                System.out.println("[" + tfin + "ms.] tick = " + nticks + ", mitick =  " + minticks);
            }
        }
    }
}
