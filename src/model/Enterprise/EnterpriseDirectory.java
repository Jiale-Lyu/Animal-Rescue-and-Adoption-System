
package model.Enterprise;

import java.util.ArrayList;
import model.Enterprise.Enterprise.Type;

/**
 *
 * @author fanyesun
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseList;
    //getEnterpriseList
    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    public EnterpriseDirectory(){
        enterpriseList = new ArrayList<Enterprise>();
    }   

    
    //Create enterprise enterName
    public Enterprise createAndAddEnterprise(String enterName, Type enterType){
        
        Enterprise enterprise = null;
        //judge the type of enterprise and put into arraylist
        if (enterType.getValue().equals(Type.AnimalShelter.getValue())) {
            enterprise = new AnimalShelterEnterprise(enterName);
            enterpriseList.add(enterprise);
        } //judge the type of enterprise and put into arraylist
        else if (enterType.getValue().equals(Type.MedicalCare.getValue())) {
            enterprise = new MedicalCareEnterprise(enterName);
            enterpriseList.add(enterprise);
        } //judge the type of enterprise and put into arraylist
        else if (enterType.getValue().equals(Type.Adoption.getValue())) {
            enterprise = new AdoptionEnterprise(enterName);
            enterpriseList.add(enterprise);
        }//judge the type of enterprise and put into arraylist
        else if (enterType.getValue().equals(Type.Volunteer.getValue())) {
            enterprise = new VolunteerEnterprise(enterName);
            enterpriseList.add(enterprise);
        }

        return enterprise;
    }

    public boolean nameIsUnique(String nameUnique){
        //set name unique
        for(Enterprise enterprise : enterpriseList){
            if(nameUnique.equalsIgnoreCase(enterprise.getName())) return false;
         }
        return true;
    }
    
    public Enterprise getEnterpriseByName(String nameUnique){
        for (Enterprise e : enterpriseList){
            if (nameUnique.equalsIgnoreCase(e.getName())) return e;
        }
        return null;
    }
}
