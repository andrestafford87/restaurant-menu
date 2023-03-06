package restaurants;

import restaurant.MenueItem;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class MyMenu {

    ArrayList<MyMenuItem> myMenuItems = new ArrayList<>();

    Date lastUpdated;

    public MyMenu() {
        this.lastUpdated = new Date();
    }



    public ArrayList<MyMenuItem> getMyMenuItems() {
        return myMenuItems;
    }

    public void setMyMenuItems(ArrayList<MyMenuItem> myMenuItems) {
        this.myMenuItems = myMenuItems;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void addMenuItem(MyMenuItem item){
        this.myMenuItems.add(item);
        this.lastUpdated = new Date();
    }

    public void removeMenuItem(MyMenuItem item){
        this.myMenuItems.remove(item);
        this.lastUpdated = new Date();
    }


//    public String toSDate(){
//        String myString = "";
//        for(MyMenuItem item : this.myMenuItems){
//            myString += item + "\n\n";
//        }
//        return myString;
//    }


    @Override
    public String toString() {
        String myString="";
        for(MyMenuItem item : this.myMenuItems){
            myString += item.toString() + "\n\n";
        }
        return myString;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyMenu)) return false;
        MyMenu myMenu = (MyMenu) o;
        return getMyMenuItems().equals(myMenu.getMyMenuItems()) && getLastUpdated().equals(myMenu.getLastUpdated());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMyMenuItems(), getLastUpdated());
    }
}


