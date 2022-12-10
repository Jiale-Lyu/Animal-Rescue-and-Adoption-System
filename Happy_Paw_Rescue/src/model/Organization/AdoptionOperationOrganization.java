
package model.Organization;
import java.util.ArrayList;
import model.Role.AdoptionManagerRole;
import model.Role.Role;


/**
 *
 * @author fanyesun
 */
public class AdoptionOperationOrganization extends Organization{
    //create AdoptionOperationOrganization
    public AdoptionOperationOrganization(String nameAdopter) {
        super(nameAdopter, Organization.Type.AdoptionOperation);
    }


    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> supportRoles = new ArrayList<>();
        supportRoles.add(new AdoptionManagerRole());
        return supportRoles;
    }
    
}
