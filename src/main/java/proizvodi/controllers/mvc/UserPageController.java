package proizvodi.controllers.mvc;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import proizvodi.entities.Product;
import proizvodi.security.UserDetailsServiceImpl;
import proizvodi.services.UserService;

@Controller
public class UserPageController {
	
	@Autowired
	UserService userService;
	

	@GetMapping("/")
	public String MainPage(Model model) {
		return "redirect:login";
	}
	
	@GetMapping("userpage")
	public String userPage(Model model) {
		UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		List<Product> products = userService.getByUsername(userDetails.getUsername()).getProducts();
		model.addAttribute("products", products);
		return "userpage";
	}
	
	

}
