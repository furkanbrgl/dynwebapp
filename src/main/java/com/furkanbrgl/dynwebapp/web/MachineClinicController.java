package com.furkanbrgl.dynwebapp.web;

import com.furkanbrgl.dynwebapp.service.MachineClinicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MachineClinicController {

    @Autowired
    private MachineClinicService machineClinicService;

    @RequestMapping("/pcs")
    @ResponseBody
    public String welcome() {
        return "Welcome to Machine Clinic World!";
    }

    @RequestMapping("/owners")
    public ModelAndView getOwners() {
        ModelAndView mav = new ModelAndView();
        mav.addObject("owners", machineClinicService.findOwners());
        mav.setViewName("owners");
        return mav;
    }
}
