package Tourist;

import Locations.Boracay;
import Locations.Bohol;
import Locations.Cagayan;
import Locations.Cavite;
import Locations.Locations;
import Locations.Ilocos;
import Locations.Siargao;


public class Me implements Tourist {

    static int budget = 1000;

    public void visit() {
        
        if (budget<100) {
        System.out.print("You cannot visit. No more money. GET MORE!!!");
        System.exit(0); }
        else
        System.out.println("Enjoying my stay");
        
    }

    public void visit(Boracay boracay) {

        System.out.println("My budget is " + boracay.airFare + " in Boracay");
        visit();
        budget -= boracay.airFare;
        checkBudget();

    }

    public void visit(Bohol bohol) {

        System.out.println("My budget is " + bohol.airFare + " in Bohol");
        visit();
        budget -= bohol.airFare;
        checkBudget();
 
    }

    public void visit(Cagayan cagayan) {
        
        System.out.println("My budget is " + cagayan.airFare + " in Cagayan ");
        visit();
        budget -= cagayan.airFare;  
        checkBudget();

    }

    public void visit(Cavite cavite) {

        System.out.println("My budget is " + cavite.airFare + " in Cavite");
        visit();
        budget -= cavite.airFare;
        checkBudget();
   
    }

    public void visit(Ilocos ilocos) {

        System.out.println("My budget is " + ilocos.airFare + " in Ilocos");
        visit();
        budget -= ilocos.airFare;
        checkBudget();
   
    }
    
    public void visit(Siargao siargao) {

        System.out.println("My budget is " + siargao.airFare + " in Siargao");
        visit();
        budget -= siargao.airFare;  
        checkBudget();
    }

    public void checkBudget() {
        budget -= Locations.airFare;
        System.out.println("my budget is " + budget + "\n");
    }

}