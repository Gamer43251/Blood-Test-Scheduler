/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blood.test.scheduler;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
/**
 *
 * @author Dreel
 */
public class Backend {
    private String folderPath = "C:/BloodTest";
    private String filePath = folderPath + "/Patients.txt";
    private String noShowFilePath = folderPath + "/NoShows.txt";
    
    public void initialise(){
        File folder = new File(folderPath);
        if(!folder.exists()){
            folder.mkdir();
            System.out.println("Folder Created: " + folderPath);
        
            String fileName = "/resources/patients.txt";
            String noShowFileName = "/resources/no-shows.txt";

            try{
                BufferedReader br = new BufferedReader(new InputStreamReader(Backend.class.getResourceAsStream(fileName)));
                BufferedWriter bw = new BufferedWriter(new FileWriter(filePath));

                String line;
                while ((line = br.readLine()) != null) {
                    bw.write(line);
                    bw.newLine();
                }
                
                br.close();
                bw.close();
                
                br = new BufferedReader(new InputStreamReader(Backend.class.getResourceAsStream(noShowFileName)));
                bw = new BufferedWriter(new FileWriter(noShowFilePath));

                while ((line = br.readLine()) != null) {
                    bw.write(line);
                    bw.newLine();
                }

                br.close();
                bw.close();
            }catch(IOException e){
                System.out.println("Error Handling Patient Information: " + e);
            }
        }
    }
    
    public void addPatient(Patient patient) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(patient.toFileString());
            writer.newLine();

        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
    
    public PriorityQueue<Patient> getPatients(){
        PriorityQueue<Patient> patients = new PriorityQueue<Patient>();
        try{
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = br.readLine()) != null) {
                
                String[] data = line.split("\\|");
                
                if(data.length == 5){
                    String name = data[0];
                    String priority = data[1];
                    String gpName = data[2];
                    int age = Integer.parseInt(data[3]);
                    boolean fromHospital = Boolean.parseBoolean(data[4]);
                    
                    patients.add(new Patient(name, priority, gpName, age, fromHospital));
                }
            }
        }catch(IOException e){
            System.out.println("Error Importing Patient Information: " + e);
        }
        System.out.println(patients.size());
        return patients;
    }
    
    public Queue<Patient> getNoShows(){
        Queue<Patient> noShows = new LinkedList<Patient>();
        try{
            BufferedReader br = new BufferedReader(new FileReader(noShowFilePath));
            String line;
            while ((line = br.readLine()) != null) {
                
                String[] data = line.split("\\|");
                
                if(data.length == 5){
                    String name = data[0];
                    String priority = data[1];
                    String gpName = data[2];
                    int age = Integer.parseInt(data[3]);
                    boolean fromHospital = Boolean.parseBoolean(data[4]);
                    
                    noShows.add(new Patient(name, priority, gpName, age, fromHospital));
                }
            }
        }catch(IOException e){
            System.out.println("Error Importing Patient Information: " + e);
        }
        System.out.println(noShows.size());
        return noShows;
    }

    
    public void updatePatientFile(Queue<Patient> patientQueue) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Patient patient : patientQueue) {
                writer.write(patient.toFileString()); // Ensure Patient class has a method for this
                writer.newLine();
            }
            System.out.println("Updated patient file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void updateNoShowFile(Queue<Patient> noShowQueue) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(noShowFilePath))) {
            for (Patient patient : noShowQueue) {
                writer.write(patient.toFileString()); // Ensure Patient class has a method for this
                writer.newLine();
            }
            System.out.println("Updated no-show file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    
    
}
