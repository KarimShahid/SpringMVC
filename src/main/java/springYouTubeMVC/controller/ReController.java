package springYouTubeMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {

	//Redirecting using redirect prefix
	@RequestMapping("/one")
	public String one() {
		System.out.println("this is one handler");
		return "redirect:/enjoy";
	}

	@RequestMapping("/enjoy")
	public String two() {
		System.out.println("this is two handler[enjoy]");
		return "";
	}
	
	
	//Redirecting using redirect view
	@RequestMapping("/two")
	public RedirectView three() {
		System.out.println("this is two handler[enjoy]");
		RedirectView redirectView =new RedirectView();
		redirectView.setUrl("enjoy");
		return redirectView;
	}

}
