/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.FoodSafetyEnterpriseAdminRole.FoodSafetyEnterpriseAdminWorkArea;

/**
 *
 * @author KNN Team
 */
public class FoodSafetyEnterpriseAdminRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        System.out.println("food safety roles have been created ");
        return new FoodSafetyEnterpriseAdminWorkArea(userProcessContainer, enterprise,business);
    }
    
    @Override
    public String toString(){
        return (RoleType.FoodDonationEnterpriseAdmin.getValue());
    }
}
