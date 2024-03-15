package jp.ac.ohara.shiftManager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import jp.ac.ohara.shiftManager.model.ShiftManagerModel;
import jp.ac.ohara.shiftManager.service.ShiftManagerModelService;

@Controller
public class ShiftController {

    @Autowired
    ShiftManagerModelService shiftManagerService;

   
   

    @GetMapping("/view/registration")
    public String showRegistrationForm(Model model) {
        model.addAttribute("shift", new ShiftManagerModel());
        return "registration";
    }

    
   
    
    @GetMapping("/shifts")
    public String showShifts(Model model) {
        model.addAttribute("shifts", shiftManagerService.getShiftTable());
        return "shifts";
    }
    
    @PostMapping("/shifts")
    public String addShift(@ModelAttribute("shift") ShiftManagerModel shift) {
        shiftManagerService.saveShift(shift);
        return "redirect:/shifts";
    }
    
    @PostMapping("/shifts/delete/{id}")
    public String deleteShift(@PathVariable("id") long id) {
        shiftManagerService.deleteShiftById(id);
        return "redirect:/shifts";
    }


}
