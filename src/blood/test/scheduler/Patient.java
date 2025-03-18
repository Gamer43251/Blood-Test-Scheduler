/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blood.test.scheduler;

/**
 *
 * @author Dreel
 */
public class Patient implements Comparable<Patient>{
    private String name, priority, gpName;
    private int age;
    private boolean fromHospital;

    public Patient(String name, String priority, String gpName, int age, boolean fromHospital) {
        this.name = name;
        this.priority = priority;
        this.gpName = gpName;
        this.age = age;
        this.fromHospital = fromHospital;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public void setGpName(String gpName) {
        this.gpName = gpName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFromHospital(boolean fromHospital) {
        this.fromHospital = fromHospital;
    }

    public String getName() {
        return name;
    }
    
    public String getPriorityString(){
        return this.priority;
    }

    public int getPriority() {
        switch(this.priority){
            case "Low":{
                return 1;
            }
            case "Medium":{
                return 2;
            }
            case "High":{
                return 3;
            }
        }
        return 0;
    }

    public String getGpName() {
        return gpName;
    }

    public int getAge() {
        return age;
    }

    public boolean isFromHospital() {
        return fromHospital;
    }
    
    @Override
    public String toString(){
        return name + " | " + priority + " | " + gpName + " | " + age + " | " + fromHospital;
    }
    
    public String toFileString() {
        return name + "|" + priority + "|" + gpName + "|" + age + "|" + fromHospital;
    }
    
    public int compareTo(Patient other){
        
        int comparison = Integer.compare(other.getPriority(),this.getPriority());
        if(comparison != 0){
            return comparison;
        }
        
        int ageComparison = Integer.compare(other.getAge(), this.getAge());
        if (ageComparison != 0) {
            return ageComparison; // If ages differ, return the comparison result
        }
        
        return Boolean.compare(other.isFromHospital(), this.isFromHospital());
    }
    
}
