import model.House;
import repository.HouseRepository;
import service.HouseService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        HouseRepository houseRepository = new HouseRepository();
        HouseService houseService = new HouseService(houseRepository);

        System.out.println("Total price of houses: " + houseService.getTotalPriceOfHouses());
        System.out.println("Total price of villas: " + houseService.getTotalPriceOfVillas());
        System.out.println("Total price of summer houses: " + houseService.getTotalPriceOfSummerHouses());
        System.out.println("Total price of all houses: " + houseService.getTotalPriceOfAllHouses());

        System.out.println("Average square meters of houses: " + houseService.getAverageSquareMetersOfHouses());
        System.out.println("Average square meters of villas: " + houseService.getAverageSquareMetersOfVillas());
        System.out.println("Average square meters of summer houses: " + houseService.getAverageSquareMetersOfSummerHouses());
        System.out.println("Average square meters of all houses: " + houseService.getAverageSquareMetersOfAllHouses());

        List<House> filteredHouses = houseService.filterHousesByRoomsAndLivingRooms(3, 1);
        System.out.println("Filtered houses with 3 rooms and 1 living room: " + filteredHouses.size());
    }
} 