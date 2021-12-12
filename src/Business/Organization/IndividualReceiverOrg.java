/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.IndividualReceiverOrgAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author KNN Team
 */
public class IndividualReceiverOrg extends Organization {
    public IndividualReceiverOrg(String name){
        super(name);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new IndividualReceiverOrgAdminRole());
        return roles;
    }
    
}