package Drinks;

import Consume.Drinkable;
import Menu.HotDrink;

public class Expresso extends HotDrink implements Drinkable {

    public Expresso(String name, Integer temperature, Integer price){
        super(name, temperature, temperature);
    }
    public Expresso(){
        super("Expresso", 75, 3);
    }
    public String drink(){
        return "Drinking Expresso";
    }


}
