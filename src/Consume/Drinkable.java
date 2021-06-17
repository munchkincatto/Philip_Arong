package Consume;

public interface Drinkable {

    String drink();
    Integer getPrice();
    default Integer getTemperature() {
        return 10;
    }

}
