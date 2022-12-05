/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Animal;

/**
 *
 * @author Jiale Lyu
 */

import javax.swing.ImageIcon;
import model.Enterprise.AnimalShelterEnterprise;
import model.UserAccount.UserAccount; 
import model.WorkQueue.WorkQueue;


public class Animal {
      
    private AnimalShelterEnterprise enterprise;
    private int id;
    private String name;
    private String sex;
    private String weight;
    private String photo;
    private String area;
    private WorkQueue workQueue;
    private ImageIcon photoIcon;
    private String vetMessage;
    private String baviorCheckMessage;
    private String pharmacyMessage;
    private UserAccount manager;
    private UserAccount adoptor;
    private boolean adpotionRequested;
    
    //Animal constructor
    public Animal(String nm) {
        name = nm;
        this.workQueue = new WorkQueue();
    }
    
    //getter and setter
    public void setEnterprise(AnimalShelterEnterprise enterprise) {
        this.enterprise = enterprise;
    }

    public AnimalShelterEnterprise getEnterprise() {
        return enterprise;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
    public void setPhotoIcon(ImageIcon photoIcon) {
        this.photoIcon = photoIcon;
    }

    public String getVetMessage() {
        return vetMessage;
    }
    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public ImageIcon getPhotoIcon() {
        return photoIcon;
    }

    public void setVetMessage(String vetMessage) {
        this.vetMessage = vetMessage;
    }

    public String getPharmacyMessage() {
        return pharmacyMessage;
    }

    public void setPharmacyMessage(String pharmacyMessage) {
        this.pharmacyMessage = pharmacyMessage;
    }

    public String getBaviorCheckMessage() {
        return baviorCheckMessage;
    }

    public void setBaviorCheckMessage(String baviorCheckMessage) {
        this.baviorCheckMessage = baviorCheckMessage;
    }

    public UserAccount getManager() {
        return manager;
    }

    public void setManager(UserAccount manager) {
        this.manager = manager;
    }

    public UserAccount getAdoptor() {
        return adoptor;
    }

    public void setAdpotionRequested(boolean adpotionRequested) {
        this.adpotionRequested = adpotionRequested;
    }

    public void setAdoptor(UserAccount adoptor) {
        this.adoptor = adoptor;
    }

    public boolean isAdpotionRequested() {
        return adpotionRequested;
    }
    
    public WorkQueue getWorkQueue() {
        return workQueue;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
}
