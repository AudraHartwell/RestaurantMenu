package restaurant;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Restaurant {
    public static void main(String[] args) {

        MenuItem pretzelBites = new MenuItem("Pretzel Bites", "Handcrafted soft pretzels with Wisconsin beer cheese", "appetizer", 9.50, false);

        MenuItem bbqBaconCheddarBurger = new MenuItem("BBQ Bacon Cheddar Burger", "smoked bacon covered in our signature barbeque sauce layered with Wisconsin cheddar all atop a grade A American bison burger patty", "entre", 15.99, true);

        MenuItem frontPorchSwing = new MenuItem(
                "Front Porch Swing", "Mama's fresh squeeze lemonade with a splash of Titos", "drink", 7.50, false);

        MenuItem skilletCookie = new MenuItem("Skillet Cookie", "fresh baked chocolate chip cookie in a cast iron skillet topped with you choice of home churned ice cream", "dessert", 9.99, false);

        ArrayList<MenuItem> items = new ArrayList<>();
        items.add(pretzelBites);
        items.add(bbqBaconCheddarBurger);
        items.add(frontPorchSwing);
        items.add(skilletCookie);

        System.out.println(pretzelBites.toString());


    }

}
