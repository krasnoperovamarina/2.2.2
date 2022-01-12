package web.service;

import org.springframework.stereotype.Component;
import web.Car;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {
	static List<Car> cars = Arrays.asList(
			new Car("BMW", 6, "White"),
			new Car("Hundai", 7, "Brown"),
			new Car("Kia", 4, "Black"),
			new Car("Lada", 9, "Red"),
			new Car("Volvo", 5, "Green"));


	@Override
	public List<Car> getCar(int count) {
		return cars.stream().limit(count).collect(Collectors.toList());
	}
}




