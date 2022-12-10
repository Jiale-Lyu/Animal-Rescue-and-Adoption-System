
package model.Role;
import javax.swing.JPanel;
import model.Enterprise.AdoptionEnterprise;
import ui.Adpoter.AdopterWorkArea;
import model.EcoSystem.EcoSystem;
import model.Network.Network;
import model.Enterprise.Enterprise;
import model.Organization.AdopterOrganization;
import model.Organization.Organization;
import model.UserAccount.UserAccount;


/**
 *
 * @author fanyesun
 */
public class AdopterRole extends Role {

    public AdopterRole() {
        this.type = RoleType.Adopter;
    }


    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem ecosystem) {
        this.type = RoleType.Adopter;
        return new AdopterWorkArea(userProcessContainer, account, (AdopterOrganization) organization, (AdoptionEnterprise) enterprise, network, ecosystem);
    }


}
