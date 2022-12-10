/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Role;

import model.EcoSystem.EcoSystem;
import model.UserAccount.UserAccount;
import javax.swing.JPanel;
import model.Network.Network;
import model.Enterprise.Enterprise;
import model.Organization.Organization;
import ui.AdministrativeRole.AdminWorkAreaJPanel;

/**
 *
 * @author Yifei Chen
 */
public abstract class Role {
    
        public enum RoleType {
            
        
        VolunteerManeger("Volunteer Manager"),
        AnimalRegister("Animal Register"),
        SystemAdmin ("System Admin"),
        Vet("Vet"),
        Adopter("Adopter"),
        Pharmacist("Pharmacist"),
        BehaviorTherapist("Behavior Therapist"),
        Volunteer("Volunteer"),
        AdoptionManager("Adoption Manager"),
        AnimalManager("Animal Manager");
        


        private String value;

        private RoleType(String value) {
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

    public RoleType type;
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, 
            Enterprise enterprise, Network network, EcoSystem Ecosystem);

    public JPanel createAdminWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem ecosystem) {
        
        this.type = RoleType.SystemAdmin;
        
        return new AdminWorkAreaJPanel(userProcessContainer, account, ecosystem);
    }
    
    @Override
    public String toString() {
        return this.type.getValue();
    }    
    
}