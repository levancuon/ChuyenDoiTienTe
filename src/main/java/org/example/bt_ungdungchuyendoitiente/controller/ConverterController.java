package org.example.bt_ungdungchuyendoitiente.controller;

import org.example.bt_ungdungchuyendoitiente.service.ConverterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/converter")
public class ConverterController {
    @GetMapping("/money")
    public String convertCurrency() {
        return "/money";
    }


    @PostMapping("/converted")
    public String convert(Model model , @RequestParam("money") double money){
        ConverterService converterService = new ConverterService();
        Double moneyConvert = converterService.convertVND(money);
        model.addAttribute("convert",moneyConvert);
        model.addAttribute("money",money);
        return "/converter";
    }

}
