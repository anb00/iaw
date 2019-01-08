package com.iesemilidarder.anicolau.resolution.web.controller;

import com.iesemilidarder.anicolau.resolution.web.service.HotelService;
import com.iesemilidarder.anicolau.resolution.web.service.HotelsCreationDto;
import com.iesemilidarder.anicolau.resolution.web.bean.Hotel;
import com.iesemilidarder.anicolau.resolution.web.service.HotelService;
import com.iesemilidarder.anicolau.resolution.web.service.HotelsCreationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/hotels")
public class MultipleHotelsController {

    @Autowired
    private HotelService hotelService;

    @GetMapping(value = "/all")
    public String showAll(Model model) {
        model.addAttribute("hotels", hotelService.findAll());

        return "allHotels";
    }

    @GetMapping(value = "/create")
    public String showCreateForm(Model model) {
        HotelsCreationDto hotelsForm = new HotelsCreationDto();

        for (int i = 1; i <= 1; i++) {
            hotelsForm.addHotel(new Hotel());
        }

        model.addAttribute("form", hotelsForm);

        return "createHotelsForm";
    }

    @GetMapping(value = "/edit")
    public String showEditForm(Model model) {
        List<Hotel> hotels = new ArrayList<>();
        hotelService.findAll()
            .iterator()
            .forEachRemaining(hotels::add);

        model.addAttribute("form", new HotelsCreationDto(hotels));

        return "editHotelsForm";
    }

    @PostMapping(value = "/save")
    public String saveHotels(@ModelAttribute HotelsCreationDto form, Model model) {
        hotelService.saveAll(form.getHotels());

        model.addAttribute("hotels", hotelService.findAll());

        return "redirect:/hotels/all";
    }
}
