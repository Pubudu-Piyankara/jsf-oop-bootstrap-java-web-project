package Controllers;

import Entities.Patient;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

@Named(value = "patientController")


@Dependent
public class PatientController {
    private Patient current;

    public PatientController() {
        current = new Patient();
    }

    public Patient getCurrent() {
        return current;
    }

    public void setCurrent(Patient current) {
        this.current = current;
    }

    public String prepareToAddNewPatient() {
        current = new Patient();
        return null;
    }

    public String savePatient() {
        
        
        return "success";
    }
}
