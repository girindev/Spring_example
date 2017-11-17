package controller;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import service.MemberService;
import vo.MemberVO;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService service;
	
	@RequestMapping("/joinForm.do")
	public String joinForm() {
		return "join_form";
	}
	
	@RequestMapping("/join.do")
	public ModelAndView join(MemberVO member) {
		boolean result = service.insertMember(member);
		ModelAndView mv = new ModelAndView();
		if (result == true) {
			mv.addObject("member", member);
			mv.setViewName("join_success");
		} else {
			mv.setViewName("join_fail");
		}
		return mv;
	}
	
	@RequestMapping("/loginForm.do")
	public String loginForm() {
		return "login_form";
	}
	
	@RequestMapping(value="/login.do", method=RequestMethod.POST)
	public String login(String id, String password, HttpSession session) {
		HashMap<String, String> map = new HashMap<>();
		map.put("id", id);
		map.put("password", password);
		boolean result = service.loginMember(map);
		if (result == true) {	
			session.setAttribute("id", id);
			session.setAttribute("password", password);
			return "login_success";
		} else {
			return "login_fail";
		}
	}
	
	@RequestMapping("/myPage.do")
	public ModelAndView myPage(HttpSession session) {
		String id = String.valueOf(session.getAttribute("id"));
		ModelAndView mv = new ModelAndView();
		if (id != null && id.length() > 0) {
			//로그인 o
			System.out.println(id);
			MemberVO member = service.selectMember(id);
			System.out.println(member);
			mv.addObject("member", member);
			mv.setViewName("my_page");
		}else {
			//로그인 x
			mv.setViewName("no_login");
		}
		return mv;
	}
	
	@RequestMapping("/logout.do")
	public String logout(HttpSession session) {
		session.invalidate();
		return "logout";
	}
}
