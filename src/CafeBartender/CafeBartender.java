package CafeBartender;
import Bartender.Bartender;
import Consume.Drinkable;

import java.util.*;


public class CafeBartender implements Bartender {

    Drinkable drink;
    Integer totalPrice;

    @Override
    public void showMenu() {

        List drinks = new ArrayList();
        Collections.addAll(drinks, "Latte", "Milk", "Soy Milk", "Expresso");
        drinks.forEach(System.out::println);
    }

    @Override
    public void addDrinkable(Drinkable drink) {
        //missing codes
        this.drink = (Drinkable) new ArrayList();


    }
    @Override
    public Integer calculateTotal() {
        return null;
    }

    @Override
    public void printTicket() {
        return ;

    }

    @Override
    public String toString() {
        return "CafeBartender{" +
                "drink=" + drink +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
