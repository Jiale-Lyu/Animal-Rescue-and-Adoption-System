
package model.Organization;
import java.util.ArrayList;
import model.Role.AdopterRole;
import model.Role.Role;


/**
 *
 * @author fanyesun
 */
public class AdopterOrganization extends Organization{
    //create adopterOrganization
    public AdopterOrganization(String nameAdopter) {
        super(nameAdopter, Organization.Type.Adopter);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        //create role
        ArrayList<Role> supportRoles = new ArrayList<>();
        supportRoles.add(new AdopterRole());
        return supportRoles;
    }
    
}
