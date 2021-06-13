package com.samuellcocktails.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class MainController {
    @RequestMapping("/")
    public void index(HttpServletRequest request, HttpServletResponse response){
        StringBuffer link = request.getRequestURL();

        try{
            response.sendRedirect(link + "ingredients");
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
