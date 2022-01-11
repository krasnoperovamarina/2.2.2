package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Car;
import web.service.CountCar;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

	@GetMapping(value = "/")
	public String printWelcome(ModelMap model) {
		List<String> messages = new ArrayList<>();
		messages.add("Hello!");
		messages.add("I'm Spring MVC application");
		messages.add("5.2.0 version by sep'19 ");
		model.addAttribute("messages", messages);
		return "index";
	}

	@GetMapping(value = "/cars")
	public String getCar(@RequestParam(value = "count", defaultValue = "5", required = false) int count, ModelMap model) {
		List<Car> cars = new ArrayList<>();
		cars.add(new Car("BMW", 6, "White"));
		cars.add(new Car("Hundai", 7, "Brown"));
		cars.add(new Car("Kia", 4, "Black"));
		cars.add(new Car("Lada", 9, "Red"));
		cars.add(new Car("Volvo", 5, "Green"));
		cars=CountCar.getCar(cars, count);
		model.addAttribute("cars", cars);
		return "cars";
	}
}