package com.drink_api.drinkapi.home.Controller;

import com.drink_api.drinkapi.home.Service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value="/main/")
public class homeController {

    @Autowired
    private HomeService service;

    @GetMapping(value="home")
    public @ResponseBody String welcomehome(HttpServletRequest request){

        return "";
    }
}
