/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Role;

import javax.swing.JPanel;
import model.Organization.VolunteerOrganization;
import model.EcoSystem.EcoSystem;
import ui.Volunteer.VolunteerWorkArea;
import model.Enterprise.VolunteerEnterprise;
import model.Enterprise.Enterprise;
import model.Organization.Organization;
import model.Network.Network;
import model.UserAccount.UserAccount;

/**
 *
 * @author YifeiChen
 */
public class VolunteerRole extends Role {

    public VolunteerRole() {
        
        this.type = RoleType.Volunteer;
    }


    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization,
            
            Enterprise enterprise, Network network, EcoSystem ecosystem) {
        
        
        this.type = RoleType.Volunteer;
        
        return new VolunteerWorkArea(userProcessContainer, account, (VolunteerOrganization) organization,
                
                (VolunteerEnterprise) enterprise, network, ecosystem);
    }


}
