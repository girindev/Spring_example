package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	//return string은 특별히 보낼 modelandview가 없을 경우...
	@RequestMapping("/main.do")
	public String mainFunc() {
		return "main"; // main.jsp
	}
	@RequestMapping("/login_form.do")
	public String loginFunc() {
		return "login_form";
	}
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public ModelAndView login(@RequestParam("userId") String id, String userPW) {
		ModelAndView mv = new ModelAndView();
		if(id.equals("admin") && userPW.equals("1234")) {
			mv.addObject("loginId", id);
			mv.setViewName("login_success");
		} else {
			mv.setViewName("login_fail");
		}
		return mv;
	}
}
