/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Menu;

import java.util.ArrayList;

/**
 *
 * @author KNN Team
 */
public class Menu {
    private ArrayList<Item> listOfItems;

    public Menu() {
        listOfItems = new ArrayList<>();
    }
    

    public ArrayList<Item> getListOfItems() {
        return listOfItems;
    }

    public void setListOfItems(ArrayList<Item> itemList) {
        this.listOfItems = itemList;
    }
    
    public void addItem(Item item){
        listOfItems.add(item);
    }
    public void removeItem(Item item){
        listOfItems.remove(item);
    }
    public void removeAllItems(){
        listOfItems.clear();
    }
    
    
    
}
