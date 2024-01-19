package com.example.consumingrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(SteamController.STEAM)
public class SteamController {
    public static final String STEAM = "/steam";

    @Autowired
    SteamService steamService;

    @GetMapping
    public String getSteam(Model model) {
        Root quote = steamService.getRoot();
        int gameNum = (int)(Math.random()*100)+1;
            model.addAttribute("nombre",quote.response().games().get(gameNum).name());
            model.addAttribute("id",quote.response().games().get(gameNum).appid());
            model.addAttribute("img_url",quote.response().games().get(gameNum).img_icon_url());

        return "steam";
    }
}
