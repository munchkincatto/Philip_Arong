package Drinks;

import Consume.Drinkable;
import Menu.ColdDrink;

public class Latte implements MixedDrink, Drinkable {


    public Latte(ColdDrink coldDrink){

   //make a constructor with 1 parameter : ColdDrink ???
        // name = Latte ; HotDrink = Expresso ; percentage = 50
    }

    @Override
    public String drink() {
        return null;
    }

    @Override
    public Integer getPrice() {
        return null;
    }

    @Override
    public Integer getTemperature() {
        return null;
    }
}
