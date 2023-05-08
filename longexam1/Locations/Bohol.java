package Locations;

import Tourist.Tourist;

public class Bohol implements Locations {

    public int airFare = 200;

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}