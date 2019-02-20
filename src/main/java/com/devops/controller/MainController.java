package com.devops.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.devops.logic.MainLogic;

@Controller
public class MainController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView getHelloWorldView(){
		return new ModelAndView("helloworld");
	}
	
	@RequestMapping(value="/getMessage/{message}", method=RequestMethod.GET)
	public @ResponseBody String getMessage(@PathVariable String message){
		return new MainLogic(message).getMessage();
	}
}
