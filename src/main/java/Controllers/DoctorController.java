/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

/**
 *
 * @author ASUS
 */
import Entities.Doctor;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class DoctorController {
    private Doctor current = new Doctor();

    public Doctor getCurrent() {
        return current;
    }

    public void setCurrent(Doctor current) {
        this.current = current;
    }

    public String prepareToAddNewDoctor() {
        current = new Doctor();
        return "doctor"; 
    }

    public String saveDoctor() {
       
        return "success"; 
    }
}
