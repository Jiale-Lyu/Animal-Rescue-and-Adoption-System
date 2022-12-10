/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Enterprise;

import model.Organization.OrganizationDirectory;
import model.WorkQueue.WorkQueue;

/**
 *
 * @author Yifei Chen
 */
public abstract class Enterprise {

    private String name;
    private final Type type;
    private WorkQueue workQueue;
    private final OrganizationDirectory organizationDirectory;


    public enum Type {
        Volunteer("Volunteer"),
        MedicalCare("Medical Care"), 
        AnimalShelter("Animal Shelter"), 
        Adoption("Adoption");

        private String value;

        private Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public Enterprise(String name, Type type) {
        this.name = name;
        this.type = type;
        organizationDirectory = new OrganizationDirectory();
        this.workQueue = new WorkQueue();        
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    
    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
    
    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    
    @Override
    public String toString() {
        return name;
    }
    

}
