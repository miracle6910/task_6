package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.model.User;
import web.service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String getAllUsers(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "users";
    }

    @GetMapping("/{id}")
    public String getUserById(@PathVariable("id") int id, Model model) {
        model.addAttribute("user", userService.getUserById(id));
        return "user-details";
    }

    @GetMapping("/new")
    public String createUserForm(Model model) {
        model.addAttribute("user", new User());
        return "user-form";
    }

    @PostMapping
    public String saveUser(@ModelAttribute("user") User user) {
        userService.saveUser(user);
        return "redirect:/users";
    }

    @GetMapping("/edit/{id}")
    public String editUserForm(@PathVariable("id") int id, Model model) {
        model.addAttribute("user", userService.getUserById(id));
        return "user-form";
    }

    @PostMapping("/{id}")
    public String updateUser(@PathVariable("id") int id, @ModelAttribute("user") User user) {
        user.setId(id);
        userService.updateUser(user);
        return "redirect:/users";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") int id) {
        userService.deleteUser(id);
        return "redirect:/users";
    }
}