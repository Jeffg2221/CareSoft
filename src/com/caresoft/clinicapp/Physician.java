package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class Physician extends User implements HIPAACompliantUser {
    @Override
    public boolean assignPin(int pin) {
        return true;
    }

    @Override
    public boolean accessAuthorized(Integer confirmedAuthID) {
        return true;
    }

    //... imports class definition...

    // Inside class:
    private ArrayList<String> patientNotes;

    // TO DO: Constructor that takes an ID
    public Physician(Integer id){
        this.id = id;
    }
    // TO DO: Implement HIPAACompliantUser!

    public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
                "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }

    // TO DO: Setters & Getters


    public ArrayList<String> getPatientNotes() {
        return patientNotes;
    }

    public void setPatientNotes(ArrayList<String> patientNotes) {
        this.patientNotes = patientNotes;
    }

    @Override
    public String toString() {
        return "Physician{" +
                "patientNotes=" + patientNotes +
                ", id=" + id +
                ", pin=" + pin +
                '}';
    }
}
