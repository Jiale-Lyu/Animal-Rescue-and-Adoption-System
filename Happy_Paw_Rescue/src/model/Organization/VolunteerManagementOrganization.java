/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Organization;

import java.util.ArrayList;
import model.Role.Role;
import model.Role.VolunteerManagerRole;

/**
 *
 * @author YifeiChen
 */
public class VolunteerManagementOrganization extends Organization{

    public VolunteerManagementOrganization(String name) {
        super(name, Organization.Type.VolunteerManagement);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        
        ArrayList<Role> roles = new ArrayList<>();
        
        roles.add(new VolunteerManagerRole());
        return roles;
    }
    
}
