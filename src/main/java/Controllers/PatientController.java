package Controllers;

import Entities.Patient;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "patientController")
@ViewScoped
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
        return null; // stays on the same page
    }

    public String savePatient() {
        // Implement saving logic here, e.g., call a service to save the patient
        // patientService.save(current);
        return "success"; // navigation case to a success page
    }
}
