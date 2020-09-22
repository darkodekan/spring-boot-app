package proizvodi.controllers.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import proizvodi.entities.User;
import proizvodi.services.UserService;

@Controller
public class LoginController {
	@Autowired
	UserService userService;
	
	@GetMapping("login")
	public String getLogin(Model model) {
		model.addAttribute("user", new User());
		return "login";
	}
	@PostMapping("/login")
	public String postLogin(User user, Model model) {
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
		
		if(userService.userExists(user)) {
			return "redirect:userpage";
		}
		model.addAttribute("message", "Wrong username or password!");
		return "login";
		
	}
	
	@PostMapping("/logout")
	public void postLogout() {
		
	}
}
