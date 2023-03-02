import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private ArrayList<MenueItem> menuItems = new ArrayList<>();

    private Date lastUpdated;

    public Menu() {
        this.lastUpdated = new Date();
    }

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
}
