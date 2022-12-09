/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Role;

import javax.swing.JPanel;
import model.EcoSystem.EcoSystem;
import model.Enterprise.AnimalShelterEnterprise;
import model.Enterprise.Enterprise;
import model.Network.Network;
import model.Organization.AnimalManagementOrganization;
import model.Organization.Organization;
import model.UserAccount.UserAccount;
import ui.AnimalManagerRole.ManageAnimalJPanel;

/**
 *
 * @author Jiale Lyu
 */
public class AnimalManagementRole extends Role {
    
    public AnimalManagementRole() {
        this.type = Role.RoleType.AnimalManager;
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem ecosystem) {
        this.type = RoleType.AnimalManager;
        return new ManageAnimalJPanel(userProcessContainer, account, (AnimalManagementOrganization) organization, (AnimalShelterEnterprise) enterprise, network, ecosystem);
    }
}
