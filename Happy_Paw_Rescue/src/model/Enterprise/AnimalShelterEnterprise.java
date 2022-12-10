/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Enterprise;

import model.Animal.AnimalDirectory;

/**
 *
 * @author Jiale Lyu
 */
public class AnimalShelterEnterprise extends Enterprise{

    private final AnimalDirectory animalDirectory;
    
    public AnimalShelterEnterprise(String name) {
        super(name, Enterprise.Type.AnimalShelter);
        animalDirectory = new AnimalDirectory(this);
    }

    public AnimalDirectory getAnimalDirectory() {
        return animalDirectory;
    }

    
}
