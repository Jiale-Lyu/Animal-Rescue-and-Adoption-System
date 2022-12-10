/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.UserAccount;

import model.Role.Role;
import java.util.ArrayList;
import model.Enterprise.Enterprise;
import model.Network.Network;
import model.Organization.Organization;

/**
 *
 * @author Jiale Lyu
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList<>();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAccount createUserAccount(String username, String password, Role role, Network network, Enterprise enterprise, Organization organization){
        UserAccount userAccount = new UserAccount();        
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setRole(role);
        userAccount.setNetwork(network);
        userAccount.setEnterprise(enterprise);
        userAccount.setOrgainization(organization);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public boolean userNameIsUnique(String username){
        for (UserAccount ua : userAccountList){
            if(username.equalsIgnoreCase(ua.getUsername())) return false;
         }
        return true;
    }
}
