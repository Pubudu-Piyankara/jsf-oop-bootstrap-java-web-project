package controller;

import Entities.Hospital;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class HospitalController {
    private Hospital current = new Hospital();

    public Hospital getCurrent() {
        return current;
    }

    public void setCurrent(Hospital current) {
        this.current = current;
    }

    public String prepareToAddNewHospital() {
        current = new Hospital();
        return "hospital"; // navigate to hospital.xhtml
    }

    public String saveHospital() {
        // Save the hospital details logic here
        return "success"; // navigate to a success page or show a message
    }
}
