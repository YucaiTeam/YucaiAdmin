package com.hyg.yucai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestDemo {
	
	//@Autowired
	//private UserService userService;
	
	@RequestMapping("/test")
	public ModelAndView test() {
		
		ModelAndView modelAndView = new ModelAndView();
		
//		List<TUser> list = userService.selectAllUser(null);
//		
//		modelAndView.addObject("user", list);
		
		modelAndView.setViewName("index");
		
		return modelAndView;
		
	}
}
