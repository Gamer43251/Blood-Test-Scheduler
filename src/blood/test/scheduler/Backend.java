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
import java.util.ArrayList;
/**
 *
 * @author Dreel
 */
public class Backend {
    private String folderPath = "C:/BloodTest";
    private String filePath = folderPath + "/Patients.txt";
    
    public void initialise(){
        File folder = new File(folderPath);
        if(!folder.exists()){
            folder.mkdir();
            System.out.println("Folder Created: " + folderPath);
        
            String fileName = "/resources/patients.txt";

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
            }catch(IOException e){
                System.out.println("Error Handling Patient Information: " + e);
            }
        }
    }
    
    public ArrayList<Patient> getPatients(){
        ArrayList<Patient> patients = new ArrayList<Patient>();
        try{
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                
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
    
    
}
