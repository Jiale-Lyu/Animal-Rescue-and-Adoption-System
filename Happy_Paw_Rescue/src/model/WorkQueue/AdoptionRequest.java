/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.WorkQueue;

import model.UserAccount.UserAccount;

/**
 *
 * @author fanyesun
 */
public class AdoptionRequest extends WorkRequest {
    private UserAccount adoptor;

    public UserAccount getAdoptor() {
        return adoptor;
    }

    public void setAdoptor(UserAccount adoptor) {
        this.adoptor = adoptor;
    }
    
}
