package com.robJames.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
 
/*
 * author: Crunchify.com
 * 
 */
 
@Controller
public class RobertController {
 
  @RequestMapping("/welcome")
  public ModelAndView helloWorld() {
 
    String message = "Hello this is the message from the controller";
    return new ModelAndView("welcome", "message", message);
  }
  
  @RequestMapping("/banana")
  public ModelAndView helloBanana(){
    String message2 = "Eat bananas, they're good for you";
    return new ModelAndView("banana", "message2", message2);
  }


}