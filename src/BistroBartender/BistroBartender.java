package BistroBartender;

import Bartender.Bartender;
import Consume.Drinkable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BistroBartender implements Bartender {

    @Override
    public void showMenu() {
        List drinks = new ArrayList();
        Collections.addAll(drinks, "Latte", "Milk", "Soy Milk", "Expresso");
        drinks.forEach(System.out::println);
    }

    @Override
    public void addDrinkable(Drinkable drink) {
    }

    @Override
    public Integer calculateTotal() {
        return null;
    }

    @Override
    public void printTicket() {

    }
}
