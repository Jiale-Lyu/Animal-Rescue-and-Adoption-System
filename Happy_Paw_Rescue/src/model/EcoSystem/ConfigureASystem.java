package model.EcoSystem;



//import model.Employee.Employee;
import model.Role.SystemAdminRole;
import model.UserAccount.UserAccount;

/**
 *
 * @author Jiale Lyu
 */
public class ConfigureASystem {
    //create system admin user account
    public static EcoSystem configure(){
        
        EcoSystem ecoSystem = new EcoSystem();  
             
        UserAccount account = new UserAccount();
        account.setUsername("admin");
        account.setPassword("admin");
        account.setRole(new SystemAdminRole());
        
        ecoSystem.setSystemAdmin(account);
        
        return ecoSystem;
    }
    
}
