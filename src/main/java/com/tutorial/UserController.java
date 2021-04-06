package com.tutorial;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.tutorial.SpringTutorial.Service.UserService;

@Controller
public class UserController {

//	@RequestMapping("/MyFirstPage")
//	public String greeting(@RequestParam(value = "title", required = false, defaultValue = "鐵人賽 加油!") String title,
//			Model model) {
//		model.addAttribute("name", title);
//		return "index";
//	}

	private String message = "鐵人賽第七天加油!!!";

//	@Autowired
//	UserService userService;
//
//	@GetMapping("/")
//	public String index(Map<String, Object> model) {
////		model.put("message", message);
//		model.put("ID", userService.getUserId());
//		return "index";
//	}
//	
}
