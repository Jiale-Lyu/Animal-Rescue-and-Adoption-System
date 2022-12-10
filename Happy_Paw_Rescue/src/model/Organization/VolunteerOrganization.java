/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Organization;

import java.util.ArrayList;
import model.Role.VolunteerRole;
import model.Role.Role;


/**
 *
 * @author YifeiChen
 */
public class VolunteerOrganization extends Organization{

    public VolunteerOrganization(String name) {
        
        super(name, Organization.Type.Volunteer);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        
        ArrayList<Role> roles = new ArrayList<>();
        
        roles.add(new VolunteerRole());
        return roles;
    }
    
}
