package springYouTubeMVC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springYouTubeMVC.model.User;
import springYouTubeMVC.service.UserService;

@Controller
public class ContactController {

	@Autowired
	private UserService userService;

	@ModelAttribute

	// @ModelAttribute is used for creating a common method that is used in all the
	// methods below
	// That means that model.addAttribute("Header", "Learn Code with Me"); and
	// others are run for all below methods
	public void commonDataForModel(Model model) {
		model.addAttribute("Header", "Learn Code with Me");
		model.addAttribute("desc", "Home for programmers");
	}

	// This method is to show the form!
	@RequestMapping("/contact")
	public String showForm(Model m) {
		System.out.println("Contact page has been displayed");

		return "contact";
	}

	/*
	 *
	 * // We have commented this beucase we have used @ModelAttribute. It works
	 * better.
	 * 
	 * 
	 * @RequestMapping(path = "/processForm", method = RequestMethod.POST)
	 * //@RequestParam("name") String userName ---> The "name" is name of the input
	 * tag and String userName is variable
	 * 
	 * public String handleForm(
	 * 
	 * @RequestParam(name = "name", required = false) String userName,
	 * 
	 * @RequestParam("email") String userEmail,
	 * 
	 * @RequestParam("password") String userPassword, Model model) //This model is
	 * to send data to view {
	 * 
	 * User user = new User();
	 * 
	 * //Storing the values in user obj user.setName(userName);
	 * user.setEmail(userEmail); user.setPassword(userPassword);
	 * 
	 * System.out.println(user);
	 * 
	 * //Setting the input from users in the model and sending to view //
	 * model.addAttribute("name",userName); //
	 * model.addAttribute("email",userEmail); //
	 * model.addAttribute("password",userPassword);
	 * 
	 * //adding user obj to model //We do this instead of the above code as we only
	 * need to add user object model.addAttribute("user", user);
	 * 
	 * 
	 * // System.out.println("User Name: "+user.getName()); //
	 * System.out.println("User Email: "+user.getEmail()); //
	 * System.out.println("User Password: "+user.getPassword());
	 * 
	 * return "success"; }
	 * 
	 */
	@RequestMapping(path = "/processForm", method = RequestMethod.POST)
	// @ModelAttribute does auto binding of the fields of the form to the attributes
	// of the User class
	public String handleForm(@ModelAttribute User user, Model model) {

		System.out.println(user);
		if (user.getName().isBlank()) {
			return "redirect:/contact";
		}

		// The moment the form is submitted, user is created in Database using this
		// method.
		int userId = this.userService.createUser(user);

		model.addAttribute("msg", "User created with id: " + userId);
		
		// No need to add user object to the model. Aafai garcha

		return "success";

	}

}
