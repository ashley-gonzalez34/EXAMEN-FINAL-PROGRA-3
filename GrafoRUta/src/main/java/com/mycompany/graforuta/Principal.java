/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.graforuta;

import grafospack.Grafo;

/**
 *
 * @author ASHLEY
 */
public class Principal {
    
    
    public static void main(String[] args) {
        
       Cargar data = new Cargar();
        String [] cargard = data.getArray();
        Grafo g = new Grafo(cargard);
        g.agregarRuta('Atescatempa','Moyuta', 50);
        g.agregarRuta('Atescatempa','Jerez', 20);
        g.agregarRuta('Atescatempa','Quesada',10);
        g.agregarRuta('Asuncion Mita','Comapa', 85);
        g.agregarRuta('Asuncion Mita','Jutiapa', 45);
        g.agregarRuta('Agua Blanca','El Adelanto', 26);
        g.agregarRuta('Agua Blanca','Jerez', 10);
        g.agregarRuta('Agua Blanca','San José Acatempa', 14);
        g.agregarRuta('Conguaco','Quesada', 25);
        g.agregarRuta('Conguaco','Atescatempa', 47);
        String inicio = "Asunción Mita";
        String fin    = "Jutiapa";
        String respuesta = g.encontrarRutaMinimaDijkstra(inicio, fin);
        System.out.println(respuesta);
    }
    
}
