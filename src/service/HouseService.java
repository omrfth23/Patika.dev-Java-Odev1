package service;

import model.House;
import model.Villa;
import model.SummerHouse;
import repository.HouseRepository;

import java.util.List;
import java.util.stream.Collectors;

public class HouseService {
    private HouseRepository houseRepository;

    public HouseService(HouseRepository houseRepository) {
        this.houseRepository = houseRepository;
    }

    public double getTotalPriceOfHouses() {
        return houseRepository.getHouseList().stream().mapToDouble(House::getPrice).sum();
    }

    public double getTotalPriceOfVillas() {
        return houseRepository.getVillaList().stream().mapToDouble(Villa::getPrice).sum();
    }

    public double getTotalPriceOfSummerHouses() {
        return houseRepository.getSummerHouseList().stream().mapToDouble(SummerHouse::getPrice).sum();
    }

    public double getTotalPriceOfAllHouses() {
        return getTotalPriceOfHouses() + getTotalPriceOfVillas() + getTotalPriceOfSummerHouses();
    }

    public double getAverageSquareMetersOfHouses() {
        return houseRepository.getHouseList().stream().mapToDouble(House::getSquareMeters).average().orElse(0);
    }

    public double getAverageSquareMetersOfVillas() {
        return houseRepository.getVillaList().stream().mapToDouble(Villa::getSquareMeters).average().orElse(0);
    }

    public double getAverageSquareMetersOfSummerHouses() {
        return houseRepository.getSummerHouseList().stream().mapToDouble(SummerHouse::getSquareMeters).average().orElse(0);
    }

    public double getAverageSquareMetersOfAllHouses() {
        double totalSquareMeters = houseRepository.getHouseList().stream().mapToDouble(House::getSquareMeters).sum()
                + houseRepository.getVillaList().stream().mapToDouble(Villa::getSquareMeters).sum()
                + houseRepository.getSummerHouseList().stream().mapToDouble(SummerHouse::getSquareMeters).sum();
        int totalCount = houseRepository.getHouseList().size() + houseRepository.getVillaList().size() + houseRepository.getSummerHouseList().size();
        return totalCount == 0 ? 0 : totalSquareMeters / totalCount;
    }

    public List<House> filterHousesByRoomsAndLivingRooms(int numberOfRooms, int numberOfLivingRooms) {
        return houseRepository.getHouseList().stream()
                .filter(house -> house.getNumberOfRooms() == numberOfRooms && house.getNumberOfLivingRooms() == numberOfLivingRooms)
                .collect(Collectors.toList());
    }
} 