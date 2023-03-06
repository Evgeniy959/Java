package com.topacademy.roombooking.controller;

import com.topacademy.roombooking.model.Person;
import com.topacademy.roombooking.model.Room;
import com.topacademy.roombooking.service.PersonService;
import com.topacademy.roombooking.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class PersonController {
    private final PersonService personService;
    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/add-person/{roomNumber}")
    public String saveRoom(@PathVariable("roomNumber") String roomNumber, @ModelAttribute Person person, Model model){
        person.setRoomNumber(roomNumber);
        model.addAttribute("person", person);
        return "add-person";
    }

    @PostMapping("/add-person")
    public String savePerson(@ModelAttribute Person person){
        personService.savePerson(person);
        return "message";
    }


}
