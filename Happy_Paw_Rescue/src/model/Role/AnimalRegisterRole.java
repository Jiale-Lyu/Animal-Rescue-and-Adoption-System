/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Role;

import model.EcoSystem.EcoSystem;
import model.Organization.AnimalRegisterOrganization;
import model.Organization.Organization;
import model.UserAccount.UserAccount;
import javax.swing.JPanel;
import model.Enterprise.AnimalShelterEnterprise;
import model.Enterprise.Enterprise;
import model.Network.Network;
import ui.AnimalRegistorRole.AnimalRegistorWorkAreaJPanel;

/**
 *
 * @author Jiale Lyu
 */
public class AnimalRegisterRole extends Role {

    public AnimalRegisterRole() {
        this.type = RoleType.AnimalRegister;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem ecosystem) {
        this.type = RoleType.AnimalRegister;
        return new AnimalRegistorWorkAreaJPanel(userProcessContainer, account, (AnimalRegisterOrganization) organization, (AnimalShelterEnterprise) enterprise, network, ecosystem);
    }

}
