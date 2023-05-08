import Locations.Bohol;
import Locations.Boracay;
import Locations.Cagayan;
import Locations.Cavite;
import Locations.Ilocos;
import Locations.Locations;
import Locations.Siargao;
import Tourist.Me;
import Tourist.Tourist;

public class App {
    public static void main(String[] args) throws Exception {


        Tourist me = new Me();

        Locations boracay = new Boracay();
        Locations bohol = new Bohol();
        Locations cagayan = new Cagayan();
        Locations cavite = new Cavite();
        Locations ilocos = new Ilocos();
        Locations siargao = new Siargao();


        // Long exam 1

        // 1. Add 5 new locations to visit
        // 2. Each location should have an airFare.
        // 3. Each time you visit a new location, your budget should decrease.
        // 4. In the visit method, print a message if you can visit the new location and
        // print another message if you cannot visit the location.
        // 5. Each time you visit a location, call the checkBudgetMethod

    boracay.accept(me);
    bohol.accept(me);
    cagayan.accept(me);
    cavite.accept(me);
    ilocos.accept(me);
    siargao.accept(me);



    }
}