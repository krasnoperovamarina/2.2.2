package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Car;
import web.service.CarServiceImpl;
import java.util.List;


@Controller
public class CarController {

    @Autowired
    CarServiceImpl carServiceImpl;

    @GetMapping("/cars")
    public String printCar(@RequestParam(value = "count", defaultValue = "5", required = false) int count, ModelMap model) {
        List<Car> cars = carServiceImpl.getCar(count);
        System.out.println(cars);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
