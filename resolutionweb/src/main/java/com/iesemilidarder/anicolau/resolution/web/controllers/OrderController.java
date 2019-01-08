package com.iesemilidarder.anicolau.resolution.web.controllers;

import com.iesemilidarder.anicolau.resolution.web.commands.OrderCommand;
import com.iesemilidarder.anicolau.resolution.web.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class OrderController {

  private OrderService orderService;
    
    public OrderController(OrderService orderService) {
    this.orderService = orderService;
  }

  @RequestMapping("/orders")
    public String list (Model model) {
      model.addAttribute("orders", orderService.getOrders());
        return "orders";
    }
  
  @RequestMapping("/orders/add")
    public String add (Model model) {
        model.addAttribute("orderCommand", new OrderCommand());
        return "addOrder";
    }
  
    @PostMapping("/orders")

    public String saveOrder(Model model,
                            @Valid @ModelAttribute("orderCommand") OrderCommand orderCommand,
                            BindingResult bindingResult) {
        
    	if (bindingResult.hasErrors()) {
          System.err.println("Error in validation " + bindingResult.getAllErrors());
            model.addAttribute("orderCommand", orderCommand);
            return "addOrder";
        }
      OrderCommand savedOrderCommand = orderService.saveOrder(orderCommand);
      model.addAttribute("order", savedOrderCommand);
        return "orderSaved";
    }
}
