package springYouTubeMVC.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	
	@RequestMapping(path = "/home", method=RequestMethod.GET)  //We we fire /home, this home controller works
	public String home(Model model) {  //Model model is used to send data to view using Model
		System.out.println("This is home url");
		
		// Using model
		//adding data to model and sending to view
		model.addAttribute("name", "Kim Jong");   //Key value pair
		model.addAttribute("id",1234);
		
		List<String> friends = new ArrayList<String>();
		friends.add("Sam Jackson");
		friends.add("Adele");
		friends.add("Jambori Ktm");
		
		model.addAttribute("f", friends);
	
		
		return "index";    //String returns the pages/views name
	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("This is about controller");
		return "about";
	}
	
	@RequestMapping("/service")
	public ModelAndView service() {
		System.out.println("This is service controller");
		
		List<String> address = new ArrayList<String>();
		address.add("Seoul");
		address.add("Tokyo");
		address.add("PKR");
		
		
		//Creating ModelAndView object
		ModelAndView modelAndView = new ModelAndView();  
		
		modelAndView.addObject("name", "Luffytaro");
		modelAndView.addObject("age", 21);
		modelAndView.addObject("address", address);
		
		modelAndView.setViewName("service");
		
		
		return modelAndView;
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {   //for sending data to view using ModelAndView
		System.out.println("This is help controller");
		
		//Creating ModelAndView object
		ModelAndView modelAndView = new ModelAndView();  
		
		//Inserting value in the object
		modelAndView.addObject("name","John Cena");
		modelAndView.addObject("id",2344);
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time",now);
		
		
		//Setting the view name
		modelAndView.setViewName("help");
		return modelAndView;
	}
	
	
	
	
	

}
