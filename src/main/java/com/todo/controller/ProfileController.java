package com.todo.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.todo.domain.Criteria;
import com.todo.service.ProfileService;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/profile")
public class ProfileController {
//	@Autowired
	private ProfileService service;
	
	@GetMapping("/")
	public void list(
		@ModelAttribute("cri") Criteria cri,
		Principal principal,
		Model model) {
	model.addAttribute("list", service.getList(cri));
	
	}
	
}
