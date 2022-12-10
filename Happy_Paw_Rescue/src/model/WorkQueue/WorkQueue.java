/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.WorkQueue;

import java.util.ArrayList;


/**
 *
 * @author Yifei Chen
 */
public class WorkQueue {
    
    private ArrayList<WorkRequest> workRequestList;

    public WorkQueue() {
        workRequestList = new ArrayList<>();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
}