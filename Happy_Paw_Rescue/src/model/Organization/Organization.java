/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Organization;

import java.util.ArrayList;
import model.Role.Role;




/**
 *
 * @author Yifei Chen
 */
public abstract class Organization {

    
    private String name;
    private final Type type;
    private final int organizationID;
    private static int idCounter;
    
    public enum Type {
        
        
        Vet("Vet Organization"),
        AnimalRegister("Animal Register Organization"), 
        AdoptionOperation("Adoption Operation Organization"), 
        AnimalManagement("Animal Management Organization"), 
        Treatment("Treatment Organization"),
        VolunteerManagement("Volunteer Management Organization"),
        Volunteer("Volunteer Organization"),
        Adopter("Adopter Organization");
        
        
        
        
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

    public Organization(String name, Type type) {
        
        this.name = name;
        this.type = type;
        
        organizationID = idCounter;
        
        ++idCounter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public Type getType() {
        return type;
    }
    
    @Override
    public String toString() {
        return name;
    }
    
    
}
