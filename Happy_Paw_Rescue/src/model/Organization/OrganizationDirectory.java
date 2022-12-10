/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Organization;

import model.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author Jiale Lyu
 */
public class OrganizationDirectory {
    
    private final ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(String name, Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.AnimalRegister.getValue())){
            organization = new AnimalRegisterOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.AnimalManagement.getValue())){
            organization = new AnimalManagementOrganization(name);
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.Vet.getValue())){
            organization = new VetOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Treatment.getValue())){
            organization = new TreatmentOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Adopter.getValue())){
            organization = new AdopterOrganization(name);
            organizationList.add(organization);
        }
       
        else if (type.getValue().equals(Type.AdoptionOperation.getValue())){
            organization = new AdoptionOperationOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.VolunteerManagement.getValue())){
            organization = new VolunteerManagementOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Volunteer.getValue())){
            organization = new VolunteerOrganization(name);
            organizationList.add(organization);
        }
        return organization;
    
}
    //check if the name is unique
     public boolean nameIsUnique(String name){
        for(Organization organization : organizationList){
            if(name.equalsIgnoreCase(organization.getName())){
                return false;
            }
        }
        return true;
    }
    
    public Organization getOrganizationByName(String name){
        for (Organization o : organizationList){
            if (name.equalsIgnoreCase(o.getName())) return o;
        }
        return null;
    } 
     
}