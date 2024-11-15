package com.srinivasa.mobiles.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SrinivasaMobilesController {

    @RequestMapping("/")
    public String viewHomePage(Model model) {
        return "index";
    }
}
