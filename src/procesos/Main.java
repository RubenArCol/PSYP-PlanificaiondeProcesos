/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package procesos;
/**
 *
 * @author Angela
 */
public class Main {

    /**
     * @param args the command line arguments
     */
        
    public static void main(String[] args) {
        // TODO code application logic here
        Algoritmos a = new Algoritmos();
        a.fifo();
        //a.sjf();
        //a.srtf();
        a.roundrobin(2);
        //a.fifo();
    
    }
    
}
