package restaurants;

import java.util.Objects;

public class MyMenuItem {

    private String name;

    private String description;

    private Double price;

    private String category;

    private boolean isNew;

    public MyMenuItem(String name, String description, Double price) {
        this.name = name;
        this.description = description;
        this.price = price;

        this.category = "No Category";
        this.isNew = false;
    }

    public MyMenuItem(String name, String description, Double price, String category, boolean isNew) {
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
    public String toString() {
        String myString = "";
        myString += "Item Name: " + this.name + "\n";
        myString += "Item Description: " + this.description + "\n";
        myString += "Item Price: " + this.price + "\n";
        myString += "Item Category: " + this.category + "\n";
        myString += "Is Item Updated: " + this.isNew + "\n";
        return myString;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyMenuItem)) return false;
        MyMenuItem that = (MyMenuItem) o;
        return isNew() == that.isNew() && getName().equals(that.getName()) && getDescription().equals(that.getDescription()) && getPrice().equals(that.getPrice()) && getCategory().equals(that.getCategory());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getDescription(), getPrice(), getCategory(), isNew());
    }
}
