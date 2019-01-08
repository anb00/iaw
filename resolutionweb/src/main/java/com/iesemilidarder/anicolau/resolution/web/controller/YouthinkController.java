package com.iesemilidarder.anicolau.resolution.web.controller;


import com.iesemilidarder.anicolau.resolution.web.bean.Youthink;


import com.iesemilidarder.anicolau.resolution.web.service.YouthinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class YouthinkController {
@Autowired
private YouthinkRepository YouthinkRepository;

    @RequestMapping("/youthinks")
    public String read(Model model) {
        model.addAttribute("youthinks", YouthinkRepository.findAll());
        return "readyou";
    }
    /*     @RequestMapping("/quesi")
    public String index(HttpSession session, Model model, Model caos) {
        //List<String> productTypes = Arrays.asList("Hoteles","Activities","Flights","Restaurants");
        List<String> data = Arrays.asList("yuhu0", "yuhu2", "yuhu3");
        List<String> date = Arrays.asList("aCTIVIDAD1","ACTIVIDAD2");

        //data.it
        //List<String> items = Arrays.
        model.addAttribute("datil",data);
        model.addAttribute("datiles",date);
        */
    @RequestMapping("/Youthinks/{id}")
    public String show(@PathVariable("id") Long id, Model model) {
        model.addAttribute("Youthink", YouthinkRepository.findById(id));
        return "detail";
    }

    
    @RequestMapping("/Youthinks/delete/{id}")
    public String delete(@PathVariable("id") Long id, Model model) {
        YouthinkRepository.deleteById(id);
        return "forward:/Youthinks";  // Forward happens on the server
    }
    
    @RequestMapping("/Youthinks/create")
    public String create(Model model) {
        model.addAttribute("Youthink", new Youthink());
        return "createYou";
    }
    /*
    @PostMapping("/Youthinks/createYou")
    public String saveCreate(Youthink youthink) {
    System.out.println("Saving thing: " + youthink);
         YouthinkRepository.save(youthink);
        return "forward:/index2";  // Forward happens on the server
    }

*/
    @RequestMapping("/Youthinks/update/{id}")
    public String update(@PathVariable("id") Long id, Model model) {
        model.addAttribute("Youthink", YouthinkRepository.findById(id));
        return "update";
    }
    /*
    @PostMapping("/Youthinks/update")
    public String saveUpdate(Youthink youthink) {
    System.out.println("Updating youthink: " + youthink);
        YouthinkRepository.save(youthink);
        return "forward:/Youthinks";  // Forward happens on the server
    }
    */
}
