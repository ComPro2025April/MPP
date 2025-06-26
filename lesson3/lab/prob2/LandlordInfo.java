package lesson3.lab.prob2;

import java.util.ArrayList;
import java.util.List;

public class LandlordInfo {
    private String name;
    private List<Building> buildings = new ArrayList<>();

    public LandlordInfo() {
    }

    public double calcProfits(){
        int sum = 0;
        for(Building building : buildings){
            sum += building.getTotalProfit();
        }
        return sum;
    }

    public void addBuilding(Building b) {
        buildings.add(b);
    }
}
