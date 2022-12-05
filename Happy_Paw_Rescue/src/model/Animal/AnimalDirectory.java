/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package model.Animal;
/**
 *
 * @author Jiale Lyu
 */

import java.util.ArrayList;
import model.Enterprise.AnimalShelterEnterprise;
import model.UserAccount.UserAccount;
import model.Enterprise.Enterprise;


public class AnimalDirectory {
    
    private final ArrayList<Animal> animalList;
    private final Enterprise enterprise;

    public AnimalDirectory(Enterprise enterprise) {
        this.animalList = new ArrayList<Animal>();
        this.enterprise = enterprise;
    }

    public ArrayList<Animal> getAnimalList() {
        return animalList;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }
    
    public Animal createAnimal(String name){
        Animal animal = new Animal(name);
        animal.setEnterprise((AnimalShelterEnterprise) enterprise);
        animal.setId(animalList.size()+1);
        animalList.add(animal); 
        return animal;
    }
    
    public boolean nameIsUnique(String name){
        for(Animal animal : animalList){
            if(name.equalsIgnoreCase(animal.getName())){
                return false;
            }
        }
        return true;
    }
    
    public Animal getAnimalByName(String name){
        for (Animal aa : animalList){
            if (name.equalsIgnoreCase(aa.getName())) return aa;
        }
        return null;
    }
    
    public Animal getAnimalByManager(UserAccount manager){
        for (Animal aa : animalList) {
            if (aa.getManager() == manager && aa.getAdoptor() == null) return aa;
        }
        return null;
    }
    
    public Animal getAnimalByAdoptionRequested(Boolean bb){
        for(Animal aa:animalList){
            if(bb==true) return aa;
        }
        return null;
    }
}
