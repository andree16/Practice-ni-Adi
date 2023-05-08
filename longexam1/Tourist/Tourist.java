package Tourist;

import Locations.Bohol;
import Locations.Boracay;
import Locations.Cagayan;
import Locations.Cavite;
import Locations.Ilocos;
import Locations.Locations;
import Locations.Siargao;

public interface Tourist {

    int budget = 0;

    void visit();

    void visit(Boracay boracay);

    void visit(Bohol bohol);

    void visit(Cagayan cagayan);

    void visit(Cavite cavite);

    void visit(Ilocos ilocos);

    void visit(Siargao siargao);


    default void visit(Locations locations) {
        System.out.println("Arrived on a location");
    };

    void checkBudget();
}