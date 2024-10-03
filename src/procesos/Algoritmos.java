/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package procesos;

/**
 *
 * @author Angela
 */
public class Algoritmos {

    public Procesos[] p;
    public int np=5;
    
    public Algoritmos() {  
        p = new Procesos[np];
        p[1]= new Procesos(0,5);
        p[2]= new Procesos(1,3);
        p[3]= new Procesos(2,10);
        p[4]= new Procesos(3,1);
        p[5]= new Procesos(4,2);
    
    }
    
}
