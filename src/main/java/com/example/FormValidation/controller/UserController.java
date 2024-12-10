package com.example.FormValidation.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.FormValidation.beans.User;

import jakarta.validation.Valid;

@Controller
public class UserController {
	
	@GetMapping("/register")
	public String showForm(Model model) {
		User user = new User();
		model.addAttribute(user);
		List<String> professionList = Arrays.asList("Developers", "Designer", "Tester", "Architect");
		model.addAttribute("professionList", professionList);
		return "register_form";
	}
	
	@PostMapping("/register")
	public String submitForm(@Valid @ModelAttribute("user") User user, BindingResult bindingresult, Model model) {
		System.out.println("processing form...");
		System.out.println(user);
		if(bindingresult.hasErrors()) {
			List<String> professionList = Arrays.asList("Developers", "Designer", "Tester", "Architect");
			model.addAttribute("professionList", professionList);
			return "register_form";
		}
		return "register_success";
	}

}
