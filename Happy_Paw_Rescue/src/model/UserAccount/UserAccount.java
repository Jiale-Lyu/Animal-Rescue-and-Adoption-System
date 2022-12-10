/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.UserAccount;

import model.Enterprise.Enterprise;
import model.Network.Network;
import model.Organization.Organization;
import model.Role.Role;
import model.WorkQueue.WorkQueue;

/**
 *
 * @author Jiale Lyu
 */
public class UserAccount {
    
    private String username;
    private String password;
    private String emailId;
    private Role role;
    private Network network;
    private Enterprise enterprise;
    private Organization orgainization;
    private WorkQueue workQueue;

    public UserAccount() {
        workQueue = new WorkQueue();
    }
        
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    
    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public Organization getOrgainization() {
        return orgainization;
    }

    public void setOrgainization(Organization orgainization) {
        this.orgainization = orgainization;
    }

    
    
    public WorkQueue getWorkQueue() {
        return workQueue;
    }
    
    @Override
    public String toString() {
        return username;
    }
    
}