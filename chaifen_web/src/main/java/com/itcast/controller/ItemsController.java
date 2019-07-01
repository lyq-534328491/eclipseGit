package com.itcast.controller;


import com.itcast.domain.Items;
import com.itcast.service.ItemsService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/showDetail")
    public String showDetail(Model model){
        Items items = itemsService.findById(6);
        model.addAttribute("item", items);
        return "itemDetail";
    }
    @RequestMapping("/showAll")
    public ModelAndView findAll() {
    	ModelAndView mv = new ModelAndView();
    	List<Items> items = itemsService.findAll();
    	mv.addObject("items",items);
    	mv.setViewName("itemDetail");
    	return mv;
    }
    
}
