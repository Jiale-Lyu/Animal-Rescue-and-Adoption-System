/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.WorkQueue;

/**
 *
 * @author Yifei Chen
 */
public class MedCareRequest extends WorkRequest {

    private String vetResult;

    public String getVetResult() {
        return vetResult;
    }

    public void setVetResult(String vetResult) {
        this.vetResult = vetResult;
    }

}
