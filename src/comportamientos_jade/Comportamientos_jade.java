/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamientos_jade;

import jade.core.Runtime;

import jade.core.Profile;

import jade.core.ProfileImpl;

import jade.wrapper.*;
import java.net.InetAddress;
/**
 *
 * @author Aaron Jaramillo
 */
public class Comportamientos_jade {

    public static void main(String args[]) throws StaleProxyException {

        Runtime rt = Runtime.instance();

        // Exit the JVM when there are no more containers around
        rt.setCloseVM(true);

        // Create a default profile
        //Buscar direccion en el ipconfig
        String IP_local = "";
        try {
            InetAddress direccion = InetAddress.getLocalHost();
            IP_local = direccion.getHostAddress();//ip como String
        } catch (Exception e) {
            e.printStackTrace();
        }
        //Asignar IP hallada
        Profile profile = new ProfileImpl(IP_local, 1099, "main");

        AgentContainer mainContainer = jade.core.Runtime.instance().createMainContainer(profile);
        
        AgentController AgenteCyclicBehavior = null;
        AgentController AgenteFsmBehavior = null;
        AgentController AgenteOneShotBehavior = null;
        AgentController AgenteParallelBehavior = null;
        AgentController AgenteSequentialBehavior = null;
        AgentController Agente_Ciclico_Periodico = null;
        

        try {

            AgenteCyclicBehavior = mainContainer.createNewAgent("tonto1", "agentes_jade.AgenteCyclicBehavior", new Object[0]);
            //AgenteCyclicBehavior.start();            
            
            AgenteFsmBehavior = mainContainer.createNewAgent("tonto2", "agentes_jade.AgenteFsmBehavior", new Object[0]);
            //AgenteFsmBehavior.start();
            
            //ya esta
            AgenteOneShotBehavior = mainContainer.createNewAgent("tonto3", "agentes_jade.AgenteOneShotBehavior", new Object[0]);
            //AgenteOneShotBehavior.start();
            
            AgenteParallelBehavior = mainContainer.createNewAgent("tonto4", "agentes_jade.AgenteParallelBehavior", new Object[0]);
            //AgenteParallelBehavior.start();
            
            AgenteSequentialBehavior = mainContainer.createNewAgent("tonto5", "agentes_jade.AgenteSequentialBehavior", new Object[0]);
            //AgenteSequentialBehavior.start();
            
            Agente_Ciclico_Periodico = mainContainer.createNewAgent("tonto6", "agentes_jade.Agente_Ciclico_Periodico", new Object[0]);
            Agente_Ciclico_Periodico.start();
            
        } catch (StaleProxyException e) {

            e.printStackTrace();

        }

    }

}
