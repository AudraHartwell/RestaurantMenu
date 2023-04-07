package restaurant;
import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private ArrayList<MenuItem> items;


    public Menu(ArrayList<MenuItem> items) {
        this.items = items;
    }

    private Date lastUpdated;

    public void addItem (MenuItem newItem) {
        this.items.add(newItem);
    }
    public void removeItem (MenuItem MenuItemToBeRemoved) {
        this.items.remove(MenuItemToBeRemoved);
    }


    public void printMenu () {
    }
    public void setItems(ArrayList<MenuItem> items) {
    this.items=items;
}

public void setLastUpdated(Date lastUpdated) {
    this.lastUpdated=lastUpdated;
}
public ArrayList<MenuItem> getItems() {
    return items;
}
public Date getLastUpdated() {
    return lastUpdated;
}


}
