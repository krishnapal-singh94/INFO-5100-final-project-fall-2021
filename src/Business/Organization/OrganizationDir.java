/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDir {
    
    private ArrayList<Organization> listOfOrgs;

    public OrganizationDir() {
        listOfOrgs = new ArrayList();
    }

    public ArrayList<Organization> getListOfOrgs() {
        return listOfOrgs;
    }
    
    public Organization createOrg(Type type,String name, String locationAddress){
        Organization organization = null;
        if (type.getValue().equals(Type.Restaurant.getValue())) {
            organization = new RestaurantOrg(name);
            organization.setLocationAddress(locationAddress);
            organization.setType(type);
            listOfOrgs.add(organization);
        }
        else if(type.getValue().equals(Type.PartyOrganizer.getValue())){
            organization = new PartyOrganizerOrg(name);
            organization.setLocationAddress(locationAddress);
            organization.setType(type);
            listOfOrgs.add(organization);
            System.out.println("Organization created " + organization);
        }
        else if(type.getValue().equals(Type.IndividualDonator.getValue())){
            organization = new IndividualFoodDonorOrg(name);
            organization.setLocationAddress(locationAddress);
            organization.setType(type);
            listOfOrgs.add(organization);
        }else if(type.getValue().equals(Type.FoodInspector.getValue())){
            organization = new FoodInspectOrg(name);
            organization.setLocationAddress(locationAddress);
            organization.setType(type);
            listOfOrgs.add(organization);
            System.out.println("org directory line number 51");
        }
        else if(type.getValue().equals(Type.Driver.getValue())){
            organization = new DriverOrganization(name);
            organization.setLocationAddress(locationAddress);
            organization.setType(type);
            listOfOrgs.add(organization);
            System.out.println("org directory line number 51");
        }
        else if(type.getValue().equals(Type.Orphanage.getValue())){
            organization = new OrphanageOrg(name);
            organization.setLocationAddress(locationAddress);
            organization.setType(type);
            listOfOrgs.add(organization);
            System.out.println("org directory line number 51");
        }
        else if(type.getValue().equals(Type.Oldage.getValue())){
            organization = new OldAgeOrg(name);
            organization.setLocationAddress(locationAddress);
            organization.setType(type);
            listOfOrgs.add(organization);
            System.out.println("org directory line number 51");
        }
        else if(type.getValue().equals(Type.IndividualReceiver.getValue())){
            organization = new IndividualReceiverOrg(name);
            organization.setLocationAddress(locationAddress);
            organization.setType(type);
            listOfOrgs.add(organization);
            System.out.println("org directory line number 51");
        }
        return organization;
    }
}