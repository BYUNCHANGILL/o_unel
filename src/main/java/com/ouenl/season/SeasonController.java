package com.ouenl.season;

import com.ouenl.Const;
import com.ouenl.model.season.SeasonDto;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/season")
public class SeasonController {
    @Autowired
    private SeasonService service;

/*    @RequestMapping("/list")
    public String seasonList(SeasonDto dto, Model model) {
        model.addAttribute(Const.MAX_PAGE_VAL, service.selMaxPageVal(dto));
        model.addAttribute(Const.LIST, service.selSeasonList(dto));
        return "season/list";
    }*/

    @GetMapping("/list")
    public void list() {}
}
