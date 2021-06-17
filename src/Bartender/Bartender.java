package Bartender;
import Consume.Drinkable;

public interface Bartender {

    void showMenu();
    void addDrinkable(Drinkable drink);
    Integer calculateTotal();
    void printTicket();

}
