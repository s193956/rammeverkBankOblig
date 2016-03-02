package controllers;

import models.WithdrawRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Random;

@Controller
public class WithdrawController {

    private int accountBalance = new Random().nextInt(1000000);

    @RequestMapping(value="/withdraw", method=RequestMethod.GET)
    public String withdrawForm(Model model) {
        model.addAttribute("withdrawRequest", new WithdrawRequest());
        return "withdraw";
    }

    @RequestMapping(value="/balance", method=RequestMethod.GET)
    public String balance(Model model) {
        model.addAttribute("accountBalance", accountBalance);
        return "balance";
    }

    @RequestMapping(value="/withdraw", method=RequestMethod.POST)
    public String greetingSubmit(@ModelAttribute WithdrawRequest withdrawRequest, Model model) {
        accountBalance-=withdrawRequest.getAmount();
        model.addAttribute("withdrawRequest", new WithdrawRequest());
        return "withdraw";
    }
}
