package controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView mv = new ModelAndView();
		mv.addObject("now", new Date());
		mv.addObject("msg", "�ȳ��ϼ���. ������ MVC ù �ǽ��Դϴ�.");
		mv.setViewName("sample");
		return mv;
	}

}
