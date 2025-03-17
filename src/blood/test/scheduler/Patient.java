/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blood.test.scheduler;

/**
 *
 * @author Dreel
 */
public class Patient {
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

    public String getPriority() {
        return priority;
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
    
    
    
}
