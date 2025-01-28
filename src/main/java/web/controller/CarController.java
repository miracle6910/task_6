package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public String printCars(ModelMap model) {
        List<String> messages = new ArrayList<>();
        messages.add("WTF!");
        messages.add("WHO R U?");
        messages.add("REALLY?");
        model.addAttribute("messages", messages);
        return "index";
    }
}
