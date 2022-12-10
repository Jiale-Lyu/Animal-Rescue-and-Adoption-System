/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Enterprise;

/**
 *
 * @author Yifei Chen
 */

//volunteer enterprise
public class VolunteerEnterprise extends Enterprise{

    public VolunteerEnterprise(String name) {
        
        super(name, Enterprise.Type.Volunteer);
    }
    
}
