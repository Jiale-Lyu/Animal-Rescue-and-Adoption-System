/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Enterprise;


import model.Enterprise.Enterprise.Type;
import java.util.ArrayList;



/**
 *
 * @author Yifei Chen
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseList;
   
    public EnterpriseDirectory(){
        enterpriseList = new ArrayList<Enterprise>();
    }   
    
    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name, Type type){
        
        Enterprise enterprise = null;

        if (type.getValue().equals(Type.AnimalShelter.getValue())) {
            enterprise = new AnimalShelterEnterprise(name);
            enterpriseList.add(enterprise);
        } 
        else if (type.getValue().equals(Type.Volunteer.getValue())) {
            enterprise = new VolunteerEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if (type.getValue().equals(Type.MedicalCare.getValue())) {
            enterprise = new MedicalCareEnterprise(name);
            enterpriseList.add(enterprise); 
        
        }
        else if (type.getValue().equals(Type.Adoption.getValue())) {
            enterprise = new AdoptionEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
       
        return enterprise;
    }

        public boolean nameIsUnique(String name){
        for(Enterprise enterprise : enterpriseList){
            if(name.equalsIgnoreCase(enterprise.getName())) return false;
         }
        return true;
    }
        public Enterprise getEnterpriseByName(String name){
        for (Enterprise e : enterpriseList){
            if (name.equalsIgnoreCase(e.getName())) return e;
        }
        return null;
    }
}
    

