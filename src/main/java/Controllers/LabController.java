package controllers;

import Entities.Lab;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@SessionScoped
public class LabController {
    private Lab current = new Lab();
    private List<Lab> labs = new ArrayList<>();

    public Lab getCurrent() {
        return current;
    }

    public void setCurrent(Lab current) {
        this.current = current;
    }

    public List<Lab> getLabs() {
        return labs;
    }

    public void setLabs(List<Lab> labs) {
        this.labs = labs;
    }

    public String prepareToAddNewLab() {
        current = new Lab();
        return "lab"; 
    }

    public String saveLab() {
        labs.add(current);
        return "success"; 
    }
}
