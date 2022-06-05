/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grafospack;

/**
 *
 * @author ASHLEY
 */
 public class Nodo {//
     
    
    char id;
    int  distancia   = Integer.MAX_VALUE;
    Nodo procedencia = null;
    
    public Nodo(char x, int d, Nodo p) { 
        id=x; distancia=d; procedencia=p; 
    }
    
    public Nodo(char x) { 
        this(x, 0, null); 
    }
    
    public int compareTo(Nodo tmp) { 
        return this.distancia-tmp.distancia; 
    }
    
    public boolean equals(Object o) {
        Nodo tmp = (Nodo) o;
        if(tmp.id==this.id) return true;
        return false;
    }
} 
 
