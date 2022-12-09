/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Organization;

import model.Role.AnimalRegisterRole;
import model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Jiale Lyu
 */
public class AnimalRegisterOrganization extends Organization{
//constructor
    public AnimalRegisterOrganization(String name) {
        super(name, Organization.Type.AnimalRegister);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new AnimalRegisterRole());
        return roles;
    }
     
}