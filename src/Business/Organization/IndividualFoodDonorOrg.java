/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.IndividualDonorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author KNN Team
 */
public class IndividualFoodDonorOrg extends Organization {
    private String isItCertified = "not certified";
    private String managersName = "not assigned";
    private int remainingServings = 10;
    
    public IndividualFoodDonorOrg(String name){
        super(name);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new IndividualDonorRole());
        return roles;
    }
    public String getCertified(){
        System.out.println("indiv food donor org lin number 38 "+ this.isItCertified);
        return isItCertified;
        
    }
    public String getManagersName(){
        return managersName;
    }
    public void setCertified(String ifCertified){
        this.isItCertified = ifCertified;
        
    }
    public void setManagersName(String officer){
        this.managersName = officer;
    }
    
     public int getRemainingServings() {
        return remainingServings;
    }

    public void setRemainingServings(int NoOfServingsLeft) {
        this.remainingServings = NoOfServingsLeft;
    }
}
