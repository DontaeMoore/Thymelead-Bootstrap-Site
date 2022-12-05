package com.example.thymeleafdemo.Controller;

import com.example.thymeleafdemo.DAO.Animal;
import com.example.thymeleafdemo.DAO.RaceDAO;
import com.example.thymeleafdemo.Model.Cat;
import com.example.thymeleafdemo.Model.Person;
import com.example.thymeleafdemo.Model.Race;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@Controller
public class PersonController {

    @Autowired
    private RaceDAO raceDAO;

    @GetMapping({"/", "/home"})
    String getPeople(Model model) {
        Cat c = new Cat();
        speakClearly(c);

        model.addAttribute("dude", "This is coming from the controller");

        return "people";
    }
    @GetMapping("/Bootstrap")
    String getboot(Model model) {

        return "Bootstrap";
    }


    @GetMapping("/form")
    String getForm(Model model) {

        return "form";
    }

    @GetMapping("/hank")
    String getHank(Model model) {

        return "HankGreen";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView saveContact(@ModelAttribute Person person) {
        System.out.println("save was called");
        System.out.println(person.toString());


        return new ModelAndView("redirect:/form");

    }

    static void speakClearly(Animal animal) {
        animal.speak();
    }
}
