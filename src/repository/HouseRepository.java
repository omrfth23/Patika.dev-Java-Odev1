package repository;

import model.House;
import model.Villa;
import model.SummerHouse;

import java.util.ArrayList;
import java.util.List;

public class HouseRepository {
    private List<House> houses;
    private List<Villa> villas;
    private List<SummerHouse> summerHouses;

    public HouseRepository() {
        houses = new ArrayList<>();
        villas = new ArrayList<>();
        summerHouses = new ArrayList<>();

        // Initialize with some data
        houses.add(new House(100000, 120, 3, 1));
        houses.add(new House(150000, 150, 4, 2));
        houses.add(new House(200000, 180, 5, 2));

        villas.add(new Villa(300000, 250, 6, 3));
        villas.add(new Villa(350000, 300, 7, 4));
        villas.add(new Villa(400000, 350, 8, 4));

        summerHouses.add(new SummerHouse(50000, 80, 2, 1));
        summerHouses.add(new SummerHouse(75000, 100, 3, 1));
        summerHouses.add(new SummerHouse(90000, 120, 3, 2));
    }

    public List<House> getHouseList() {
        return houses;
    }

    public List<Villa> getVillaList() {
        return villas;
    }

    public List<SummerHouse> getSummerHouseList() {
        return summerHouses;
    }
} 