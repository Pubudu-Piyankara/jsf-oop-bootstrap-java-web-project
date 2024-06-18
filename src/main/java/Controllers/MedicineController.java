package controllers;

import Entities.Medicine;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@SessionScoped
public class MedicineController {
    private Medicine current = new Medicine();
    private List<Medicine> medicines = new ArrayList<>();

    public Medicine getCurrent() {
        return current;
    }

    public void setCurrent(Medicine current) {
        this.current = current;
    }

    public List<Medicine> getMedicines() {
        return medicines;
    }

    public void setMedicines(List<Medicine> medicines) {
        this.medicines = medicines;
    }

    public String prepareToAddNewMedicine() {
        current = new Medicine();
        return "medicine";
    }

    public String saveMedicine() {
        medicines.add(current);
        return "success"; 
    }
}
