package restaurant;
import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private ArrayList<MenuItem> items;
    private Date lastUpdated;

 //   public Menu<>

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
