/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Organization;

import model.Role.AnimalManagementRole;
import model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Jiale Lyu
 */
public class AnimalManagementOrganization extends Organization{
//constructor
    public AnimalManagementOrganization(String name) {
        super(name, Organization.Type.AnimalManagement);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AnimalManagementRole());
        return roles;
    }
     
}