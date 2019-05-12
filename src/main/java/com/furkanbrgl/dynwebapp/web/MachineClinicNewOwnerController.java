package com.furkanbrgl.dynwebapp.web;

import com.furkanbrgl.dynwebapp.model.Machine;
import com.furkanbrgl.dynwebapp.model.Owner;
import com.furkanbrgl.dynwebapp.service.MachineClinicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MachineClinicNewOwnerController {

    @Autowired
    private MachineClinicService petClinicService;

    @RequestMapping(value="/owners/new",method= RequestMethod.GET)
    public String newOwner() {
        return "newOwner";
    }

    @ModelAttribute
    public Owner initModel() {
        return new Owner();
    }

    @RequestMapping(value="/owners/new",method=RequestMethod.POST)
    public String handleFormSubmit(@ModelAttribute Owner owner) {
        petClinicService.createOwner(owner);
        return "redirect:/owners";
    }

}
