/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.UserAccount;

import java.util.ArrayList;


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
    
    public UserAccount createUserAccount(String username, String password){
        UserAccount userAccount = new UserAccount();        
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        return userAccount;
    }
    
    public boolean userNameIsUnique(String username){
        for (UserAccount ua : userAccountList){
            if(username.equalsIgnoreCase(ua.getUsername())) return false;
         }
        return true;
    }
}
