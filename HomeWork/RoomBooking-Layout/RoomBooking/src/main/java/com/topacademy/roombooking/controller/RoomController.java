package com.topacademy.roombooking.controller;

import com.topacademy.roombooking.model.Person;
import com.topacademy.roombooking.model.Room;
import com.topacademy.roombooking.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class RoomController {
    private final RoomService roomService;
    @Autowired
    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    @GetMapping("/room")
    public String search(Model model){
        Room room = new Room();
        model.addAttribute("room", room);
        return "search";
    }

    /*@PostMapping("/rooms")
    public String saveRoom(Model model){
        List<Person> persons = roomService.saveRoom();
        model.addAttribute("persons", persons);
        return "add-person";
    }*/

    @PostMapping("/search")
    public String findByDate(@ModelAttribute Room room, Model model){
        List<Room> rooms = roomService.findByDate(room.getEnd(), room.getStart());
        model.addAttribute("rooms", rooms);
        return "room-list";
    }
}
