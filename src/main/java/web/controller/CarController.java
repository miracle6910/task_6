package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String showCars(ModelMap model, @RequestParam(defaultValue = "5") int count) {
            CarService carService = new CarServiceImpl();
            carService.addCar(new Car("Toyota", 2020, 150.00));
            carService.addCar(new Car("BMW", 2021, 200.15));
            carService.addCar(new Car("Nissan", 2025, 300.5));
            carService.addCar(new Car("Opel", 1999, 0.7));
            carService.addCar(new Car("Mersedes", 2023, 360.15));
            carService.addCar(new Car("UAZ", 2010, 100.00));

            if (count <=0 ) {
                model.addAttribute("cars", carService.showCars(5));
            }
            else {model.addAttribute("cars", carService.showCars(count));}
        return "cars";
    }


}
