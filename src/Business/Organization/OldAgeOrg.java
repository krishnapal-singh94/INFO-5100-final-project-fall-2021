/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.OldAgeOrgAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author KNN Team
 */
public class OldAgeOrg extends Organization {
    public OldAgeOrg(String name){
        super(name);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new OldAgeOrgAdminRole());
        return roles;
    }
    
}
