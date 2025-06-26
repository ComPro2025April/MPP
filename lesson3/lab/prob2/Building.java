package lesson3.lab.prob2;

import java.util.ArrayList;
import java.util.List;

public class Building {
    private int maintenanceCost1;
    private int maintenanceCost2;

    private List<Apartment> apartments = new ArrayList<>();

    public Building(int maintenanceCost1, int maintenanceCost2) {
        this.maintenanceCost1 = maintenanceCost1;
        this.maintenanceCost2 = maintenanceCost2;
    }

    public void addApartment(Apartment a) {
        apartments.add(a);
    }

    public int getTotalProfit(){
        int totalProfit = 0;
        for(Apartment a : apartments){
            totalProfit += a.getRentalPrice();
        }
        totalProfit = totalProfit-maintenanceCost1-maintenanceCost2;
        return totalProfit;
    }
}
