package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.UserService;
@Controller
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController (UserService userService) {
        this.userService = userService;

    }
//    @GetMapping(value = "/users")
//    public String GetCarsByCount(ModelMap model, @RequestParam(value = "count", required = false) Integer count) {
//        model.addAttribute("cars", userService.getCarsByCount(count !=null ? count : 5));
//        return "users";
//    }


}

