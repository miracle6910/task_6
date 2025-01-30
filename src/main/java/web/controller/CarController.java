package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;


@Controller
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;

    }

    @GetMapping(value = "/cars")
    public String showCars(ModelMap model, @RequestParam(defaultValue = "5") int count) {

        model.addAttribute("cars", carService.showCars(count));
        return "cars";
    }


}
