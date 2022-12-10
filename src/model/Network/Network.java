/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Network;


import model.EcoSystem.EcoSystem;
import model.Enterprise.EnterpriseDirectory;
import model.WorkQueue.WorkQueue;

/**
 *
 * @author fanyesun
 */
public class Network {

    private String name;
    private EnterpriseDirectory enterpriseDirectory;
    private EcoSystem ecosystem;
    private WorkQueue workQueue;

    //create network
    public Network(String s, EcoSystem system) {
        this.name = s;
        this.ecosystem = system;
        this.workQueue = new WorkQueue();
        enterpriseDirectory = new EnterpriseDirectory();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public EcoSystem getEcosystem() {
        return ecosystem;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }    

}
