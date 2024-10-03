/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package procesos;

import java.util.ArrayList;

/**
 *
 * @author Angela
 */
public class Algoritmos {
    
    int np = 0;   
    Procesos p[];
    int te = 0; //Tiempo de ejecucion total
    ArrayList <Integer> cola = new ArrayList<Integer>();
    int q=2;
    
    public Algoritmos() {    
        np=5;
        p = new Procesos[np];
        
        p[0]= new Procesos(0,5);
        p[1]= new Procesos(1,3);
        p[2]= new Procesos(2,10);
        p[3]= new Procesos(3,1);
        p[4]= new Procesos(4,2);
        
    }
    
    public void fifo(){
    
        for (int i = 0; i < np; i++) {
            te=te+p[i].getEjecucion();
        }
        
        System.out.println("Algoritmo Fifo");
     
        for (int i = 0; i < te; i++) {
            for (int j = 0; j < np; j++){
                if(p[j].getLlegada()==i){
                    int e=p[j].getEjecucion();
                    for (int k = 0; k < p[j].getEjecucion(); k++) {
                        cola.add(j);
                        //System.out.println(j); Para saber en que momento entran en cola
                        e--;
                    }
                    p[j].setEjecucion(e);
                }
        
            }
            int proceso=cola.getFirst();
            cola.removeFirst();
            System.out.println("Tiempo -->"+i+ "   Proceso-->"+proceso);   
        }
    }
    
    public void sjf(){
        System.out.println("Algoritmo Fifo");
    }
    public void srtf(){
    
    }
    public void roundrobin(int q){
        this.q=q;
    }
    
    
    
    
}
