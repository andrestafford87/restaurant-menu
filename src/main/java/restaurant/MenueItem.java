package restaurant;

import java.util.Objects;

public class MenueItem {

    private String name;
    private String description;
    private Double price;
    private String category;
    private boolean isNew;

    public MenueItem(String name, String description, Double price) {
        this.name = name;
        this.description = description;
        this.price = price;

        this.category = "Not Categorized";
        this. isNew = false;
    }

    public MenueItem(String name, String description, Double price, String category, boolean isNew) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.isNew = isNew;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    @Override
    public String toString(){
        String returnString = "";
        returnString += "Item Name: " + this.name + "\n";
        returnString += "Item Description: " + this.description + "\n";
        returnString += "Item Price: " + this.price + "\n";
        returnString += "Item Category: " + this.category + "\n";
        returnString += "Item Is New: " + this.isNew + "\n";
        return returnString;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if(obj == this) return true;
//        if(!(obj instanceof MenueItem)) {
//            return false;
//        }
//
//        MenueItem menueItem = (MenueItem) obj;
//        if(menueItem.name.equals(this.name)
//                && menueItem.description.equals(this.description)
//                && menueItem.category.equals(this.category)
//                && menueItem.price.equals(this.price)) return true;
//                else return false;
//
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MenueItem)) return false;
        MenueItem menueItem = (MenueItem) o;
        return isNew() == menueItem.isNew() && getName().equals(menueItem.getName()) && getDescription().equals(menueItem.getDescription()) && getPrice().equals(menueItem.getPrice()) && getCategory().equals(menueItem.getCategory());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getDescription(), getPrice(), getCategory(), isNew());
    }


    //    sudocode
//    isNew(){
//      return this.isNew
//    }



}
