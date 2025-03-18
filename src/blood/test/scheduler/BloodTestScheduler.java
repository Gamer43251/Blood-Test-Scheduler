/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package blood.test.scheduler;

import java.util.LinkedList;
import java.util.Queue;
import java.util.PriorityQueue;

/**
 *
 * @author Dreel
 */
public class BloodTestScheduler {
    private static Backend backend = new Backend();
    private static Queue<Patient> noShowQueue = new LinkedList();
    private static PriorityQueue<Patient> patientQueue;
    private final int maxNoShow = 5;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Display app = new Display();
        app.setVisible(true);
        backend.initialise();
        patientQueue = backend.getPatients();
        noShowQueue = backend.getNoShows();
        
    }
    
    public PriorityQueue<Patient> getPatientQueue(){
        return patientQueue;
    }
    
    public Queue<Patient> getNoShowQueue(){
        System.out.println("No Shows: " + noShowQueue.size());
        return noShowQueue;
    }
    
    public void addPatient(Patient patient){
        patientQueue.offer(patient);
    }
    
    public void addNoShow(Patient patient){
        if(noShowQueue.size() <= maxNoShow){
            noShowQueue.poll();
        }
        noShowQueue.add(patient);
        
    }
    
    public void updateFiles(PriorityQueue<Patient> patients, Queue<Patient> noShows){
        patientQueue = patients;
        noShowQueue = noShows;
        backend.updatePatientFile(patients);
        backend.updateNoShowFile(noShows);
    }
    
}
