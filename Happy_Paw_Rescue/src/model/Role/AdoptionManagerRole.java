/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Role;

import model.EcoSystem.EcoSystem;
import model.Network.Network;
import model.Enterprise.Enterprise;
import model.Organization.Organization;
import model.UserAccount.UserAccount;
import javax.swing.JPanel;
import model.Enterprise.AdoptionEnterprise;
import model.Organization.AdoptionOperationOrganization;
import ui.AdoptionManager.AdoptionManagerWorkArea;

/**
 *
 * @author fanyesun
 */
public class AdoptionManagerRole extends Role {

    public AdoptionManagerRole() {
        this.type = RoleType.AdoptionManager;
    }


    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem ecosystem) {
        this.type = RoleType.AdoptionManager;
        return new AdoptionManagerWorkArea(userProcessContainer, account, (AdoptionOperationOrganization) organization, (AdoptionEnterprise) enterprise, network, ecosystem);
    }


}
