package Drinks;

import Consume.Drinkable;
import Menu.ColdDrink;

public class Milk extends ColdDrink implements Drinkable {

    public Milk(String name, Integer price) {
        super(name, price);
    }
    public Milk(){
        super("Milk", 1);
    }
    public Milk(String name){
        super(name);
    }
    public String drink(){
        return "Drinking Milk";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
