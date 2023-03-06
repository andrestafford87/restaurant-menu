package restaurant;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Menu {

    private ArrayList<MenueItem> menuItems = new ArrayList<>();

    private Date lastUpdated;

    public Menu() {
        this.lastUpdated = new Date();
    }

    //    public Menu() {
//        this.lastUpdated = new Date();
//    }

    public ArrayList<MenueItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenueItem> menuItems) {
        this.menuItems = menuItems;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void addMenuItem(MenueItem item){
        this.menuItems.add(item);
        this.lastUpdated = new Date();


    }

    public void removeMenuItem(MenueItem item){
        this.menuItems.remove(item);
        this.lastUpdated = new Date();
    }

    @Override
    public String toString(){
        String returnString = "";
       for(MenueItem item : this.menuItems){
           returnString += item.toString() + "\n\n";

       }
       return returnString;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Menu)) return false;
        Menu menu = (Menu) o;
        return getMenuItems().equals(menu.getMenuItems()) && getLastUpdated().equals(menu.getLastUpdated());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMenuItems(), getLastUpdated());
    }
}
