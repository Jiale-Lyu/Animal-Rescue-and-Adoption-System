/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.EcoSystem;

import model.Network.Network;
import java.util.ArrayList;
import model.UserAccount.UserAccount;
import model.UserAccount.UserAccountDirectory;

/**
 *
 * @author Jiale Lyu
 */
public class EcoSystem {
    
    private final ArrayList<Network> networkList;
    private UserAccount systemAdmin;
    private final UserAccountDirectory userAccountDirectory;
    
    public EcoSystem(){
        networkList = new ArrayList<Network>();
        userAccountDirectory = new UserAccountDirectory();
    }
   
    public Network createNetwork(String name){
        Network network = new Network(name,this);
        networkList.add(network);
        return network;
    }
    
    public ArrayList<Network> getNetworkList() {
        return networkList;
    }
    //check if the name is unique
    public boolean nameIsUnique(String name){
        for (Network n : networkList){
            if (name.equalsIgnoreCase(n.getName())) return false;
        }
        return true;
    }

    public UserAccount getSystemAdmin() {
        return systemAdmin;
    }

    public void setSystemAdmin(UserAccount systemAdmin) {
        this.systemAdmin = systemAdmin;
    }
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    
}
