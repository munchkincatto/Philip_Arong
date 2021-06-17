package Drinks;

import Consume.Drinkable;
import Menu.ColdDrink;

public class SoyMilk extends ColdDrink implements Drinkable {


    public SoyMilk(String name, Integer price) {
        super(name, price);
    }
    public SoyMilk(){
        super("Soy Milk", 2);
    }
    public String drink(){

        return "Drinking Soy Milk";
    }



}
