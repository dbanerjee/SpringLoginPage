package springmvc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginPageController {
	@RequestMapping("/userLogin")
	public String index() {
		return "userLogin";
	}
}
