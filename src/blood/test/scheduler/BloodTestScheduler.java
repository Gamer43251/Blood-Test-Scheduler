/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package blood.test.scheduler;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Dreel
 */
public class BloodTestScheduler {
    private Queue<Patient> noShowQueue = new LinkedList<>();
    final int maxNoShow = 5;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Display app = new Display();
        app.setVisible(true);
            
        
    }
    
}
