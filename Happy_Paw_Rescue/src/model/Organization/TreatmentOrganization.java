/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Organization;

import model.Role.Role;
import model.Role.PharmacistRole;
import java.util.ArrayList;
import model.Role.BehaviorTherapistRole;



/**
 *
 * @author Yifei Chen
 */
public class TreatmentOrganization extends Organization{

    public TreatmentOrganization(String name) {
        super(name, Organization.Type.Treatment);
       
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        
        roles.add(new BehaviorTherapistRole());
        roles.add(new PharmacistRole());
        return roles;
    }

    
}