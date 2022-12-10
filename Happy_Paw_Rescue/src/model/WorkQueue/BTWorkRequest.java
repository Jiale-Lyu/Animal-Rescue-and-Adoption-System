
package model.WorkQueue;


/**
 *
 * @author Yifei Chen
 */

public class BTWorkRequest extends WorkRequest {
    
    private String result;
    private String prescription; 


    
    //get result
    public String getResult() {
        return result;
    }

    //save result
    public void setResult(String result) {
        this.result = result;
    }
    
        public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }
}
