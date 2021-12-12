/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Menu.Item;
import Business.Menu.Menu;
import Business.Role.RestaurantAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author KNN Team
 */
public class RestaurantOrg extends Organization {
    private String isItCertified = "not certified";
    private String managersName = "not assigned";
    private int remainaingServings = 10;
    private Menu menu;
    
    public RestaurantOrg(String name){
        super(name);
        menu = new Menu();
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new RestaurantAdminRole());
        return roles;
    }
    public String getCertified(){
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
        return remainaingServings;
    }

    public void setRemainaingServings(int NoOfServingsLeft) {
        this.remainaingServings = NoOfServingsLeft;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
    public int calculateServings(){
        int numberOfservings = 0;
        if(menu == null) menu = new Menu();
        for(Item item : menu.getListOfItems()){
            numberOfservings = numberOfservings + item.getNumberOfServings();
        }
        return numberOfservings;
    }
    
}
