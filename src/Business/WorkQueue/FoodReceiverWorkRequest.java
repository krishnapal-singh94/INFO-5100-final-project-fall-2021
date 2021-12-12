/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Organization.Organization.Type;
import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author KNN Team
 */
public class FoodReceiverWorkRequest extends WorkRequest{
    
    private String numberOfServings;
    private String contactNumber;
    private String emailId;
    private String donarOrgName;
    private UserAccount deliveryman;
    private Type requestingOrganizationType;
    private String requestingOrganiztionName;
    private String receivingOrganiztionName;
    private Type receivingOrganiztionType;
    private int id = 10000;
    private static int counter = 10000;
    
    public FoodReceiverWorkRequest(){
        id = counter++;
        
    }
    
    public  String getId(){
        return "fdr"+id;
    }

    public String getNumberOfServings() {
        return numberOfServings;
    }

    public void setNumberOfServings(String numberOfServings) {
        this.numberOfServings = numberOfServings;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getDonarOrgName() {
        return donarOrgName;
    }

    public void setDonarOrgName(String donarOrgName) {
        this.donarOrgName = donarOrgName;
    }

    public String getReceivingOrganiztionName() {
        return receivingOrganiztionName;
    }

    public void setReceivingOrganiztionName(String receivingOrganiztionName) {
        this.receivingOrganiztionName = receivingOrganiztionName;
    }

    public Type getReceivingOrganiztionType() {
        return receivingOrganiztionType;
    }

    public void setReceivingOrganiztionType(Type receivingOrganiztionType) {
        this.receivingOrganiztionType = receivingOrganiztionType;
    }


  
    
    public void setDeliveryMan(UserAccount account){
        this.deliveryman = account;
    }
   
    public UserAccount getDeliveryMan(){
        return this.deliveryman;
    }

    public Type getRequestingOrganizationType() {
        return requestingOrganizationType;
    }

    public void setRequestingOrganizationType(Type requestingOrganizationType) {
        this.requestingOrganizationType = requestingOrganizationType;
    }

    public String getRequestingOrganiztionName() {
        return requestingOrganiztionName;
    }

    public void setRequestingOrganiztionName(String requestingOrganiztionName) {
        this.requestingOrganiztionName = requestingOrganiztionName;
    }
    
    

    @Override
    public String toString() {
        return getId();
    }
    
    
    
}
