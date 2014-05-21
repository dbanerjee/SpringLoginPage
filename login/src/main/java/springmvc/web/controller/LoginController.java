package springmvc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user.login")
public class LoginController {
	@RequestMapping(method = RequestMethod.POST)
		public ModelAndView processCredentials(@RequestParam("userName")String userName, 
													@RequestParam("userPassword")String userPassword){
			String message = "Invalid credentials";
			if(!userName.equals("dbanerjee") && !userPassword.equals("test1234")) {
				if(userName.equals(userPassword)) {
					message = "Welcome " +userName + "!!!";
				}
			}
			return new ModelAndView("results", "message", message);
	}
}
