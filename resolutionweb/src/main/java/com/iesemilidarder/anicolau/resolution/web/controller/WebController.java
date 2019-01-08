package com.iesemilidarder.anicolau.resolution.web.controller;

import com.iesemilidarder.anicolau.resolution.core.DataHelper;
import com.iesemilidarder.anicolau.resolution.web.service.TechnologyRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.List;



@Controller
public class WebController {

    @RequestMapping(value = "/Secure") //this is Our main after this will show { customer,orders,top templates,top Activities , ...}
    public String index() {
        return "index_B";
    }





}
