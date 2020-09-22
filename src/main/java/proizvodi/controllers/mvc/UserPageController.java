package proizvodi.controllers.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class UserPageController {
	
	@GetMapping("userpage")
	public String userPage(Model model) {
		model.addAttribute("message", "product1");
		return "userpage";
	}
	
	

}
