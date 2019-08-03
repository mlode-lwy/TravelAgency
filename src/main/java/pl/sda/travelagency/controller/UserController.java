package pl.sda.travelagency.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.sda.travelagency.model.User;
import pl.sda.travelagency.service.UserService;

import javax.validation.Valid;

@Controller
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/register")
    public String register(Model model){
        User user = new User();
        model.addAttribute(user);
        model.addAttribute("password_repeat","");
        return "register";
    }

    @PostMapping("register")
    public String register(@ModelAttribute @Valid User user, BindingResult bindingResult){
        if (bindingResult.hasErrors()){

            return "register";
        }
        userService.save(user);
        return "redirect:/trip";
    }
}
