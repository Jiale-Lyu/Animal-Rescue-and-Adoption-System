/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Animal;

import java.util.ArrayList;

/**
 *
 * @author Jiale Lyu
 */
public class AnimalDirectory {
    private ArrayList<Animal> animalList;
    
    public AnimalDirectory() {
        this.animalList = new ArrayList<Animal>();
    
    }
    
    public ArrayList<Animal> getAnimalList() {
        return animalList;
    }
        
    public Animal createAnimal(String name){
        Animal animal = new Animal(name);
//        animal.setEnterprise((AnimalShelterEnterprise) enterprise);
        animal.setId(animalList.size()+1);
        animalList.add(animal); 
        return animal;
    }
    public Animal getAnimalByName(String name){
        for (Animal a : animalList){
            if (name.equalsIgnoreCase(a.getName())) return a;
        }
        return null;
    }
    
    public boolean nameIsUnique(String name){
        for(Animal animal : animalList){
            if(name.equalsIgnoreCase(animal.getName())){
                return false;
            }
        }
        return true;
    }
   
    public Animal getAnimalByAdoptionRequested(Boolean b){
        for(Animal a:animalList){
            if(b==true) return a;
        }
        return null;
    }
    
}
