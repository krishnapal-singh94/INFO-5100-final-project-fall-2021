/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Menu;

/**
 *
 * @author KNN Team
 */
public class Item {
    private String details;
    private int id;
    private String imageAdd;
    private int numberOfServings;
    
    static int count = 100;
    public Item() {
        this.id = count++;
    }
    
    public String getDetails() {
        return details;
    }

    public void setDetails(String name) {
        this.details = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImageAdd() {
        return imageAdd;
    }

    public void setImageAdd(String imagePath) {
        this.imageAdd = imagePath;
    }

    public int getNumberOfServings() {
        return numberOfServings;
    }

    public void setNumberOfServings(int numberOfServings) {
        this.numberOfServings = numberOfServings;
    }

    @Override
    public String toString(){
        return details;
    }
    
    
    
}
