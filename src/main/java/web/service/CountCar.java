package web.service;

import web.Car;
import java.util.List;
import java.util.stream.Collectors;

public class CountCar {

    public static List<Car> getCar(List<Car> cars, int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
