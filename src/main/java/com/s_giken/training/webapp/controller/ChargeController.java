package com.s_giken.training.webapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.s_giken.training.webapp.exception.NotFoundException;
import com.s_giken.training.webapp.model.Charge;
import com.s_giken.training.webapp.model.ChargeSearchCondition;
import com.s_giken.training.webapp.service.ChargeService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;

@Controller
@RequestMapping("/charge")
public class ChargeController {
    private final ChargeService chargeService;

    public ChargeController(ChargeService chargeService) { // chargeServcieには、ChargeServiceImplのインスタンスが渡される
        this.chargeService = chargeService;
    }

    @GetMapping("/search")
    public String showSearchCondition(Model model) {
        var chargeSearchCondition = new ChargeSearchCondition();
        model.addAttribute("chargeSearchCondition", chargeSearchCondition);
        return "charge_search_condition";
    }

    @PostMapping("/search")
    public String searchAndListing(
            @ModelAttribute("chargeSearchCondition") ChargeSearchCondition chargeSearchCodition,
            Model model) {
        var result = chargeService.findByConditions(chargeSearchCodition);
        model.addAttribute("result", result);
        return "charge_search_result";
    }

    @GetMapping("/edit/{id}")
    public String editCharge(
            @PathVariable int id,
            Model model) {
        var charge = chargeService.findById(id);
        if (!charge.isPresent()) {
            throw new NotFoundException("");
        }
        model.addAttribute("charge", charge);
        return "charge_edit";
    }

    @GetMapping("/add")
    public String addCharge(Model model) {
        var charge = new Charge();
        model.addAttribute("charge", charge);
        return "charge_edit";
    }

    @PostMapping("/save")
    public String saveCharge(
            @Validated Charge charge,
            BindingResult bindingResult,
            RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            return "charge_edit";
        }
        chargeService.save(charge);
        redirectAttributes.addFlashAttribute("message", "保存しました。");
        return "redirect:/charge/edit/" + charge.getChargeId();
    }

    @GetMapping("/delete/{id}")
    public String deleteCharge(
            @PathVariable int id,
            RedirectAttributes redirectAttributes) {
        chargeService.deleteById(id);
        redirectAttributes.addFlashAttribute("message", "削除しました。");
        return "redirect:/charge/search";
    }
}
