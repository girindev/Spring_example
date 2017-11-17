package controller;

import javax.jws.WebParam.Mode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import service.BookService;
import vo.BookVO;

@Controller
public class BookController {
	
	@Autowired
	private BookService service;
	public void setService(BookService service) {
		this.service = service;
	}
	/////////////////////////////////////////////
	
	@RequestMapping("/main.do")
	public String mainFunc() {
		return "main"; //main.jsp;
	}
	
	@RequestMapping("/writeForm.do")
	public String writeForm() {
		return "write_form"; //write_form.jsp
	}
	@RequestMapping(value = "/write.do", method=RequestMethod.POST)
	public ModelAndView write(BookVO book) {
		ModelAndView mv = new ModelAndView();
		int result = service.addBook(book); 
		if(result > 0) {
			mv.addObject("bookNum", result);
			mv.setViewName("write_success");
		} else {
			mv.setViewName("write_fail");
		}
		return mv;
	}
//	@RequestMapping("/searchBook.do")
//	public ModelAndView searchBook(int book_num) {
//		//search_book.jsp
//		ModelAndView mv = new ModelAndView();
//		BookVO book = 
//	}
	@RequestMapping("/bookList.do")
	public ModelAndView bookList() {
		//book_list.jsp
		ModelAndView mv = new ModelAndView("book_list");
		mv.addObject("bookList", service.selectAll());
		return mv;
	}
	@RequestMapping("/delete.do")
	public ModelAndView deleteFunc(@RequestParam(defaultValue="0") int bookNum) {
		ModelAndView mv = new ModelAndView();
		int result = service.deleteBook(bookNum);
		//////////////////////////////////////////////////////
		//	책 삭제 이후에 목록을 바로 보여주고 싶은 경우
		//	아래처럼 책 데이터를 다시 첨부해서 book_list 뷰에
		//	보내야 책 목록이 나옴.
		//	mv.addObject("bookList, service.getBookList());
		//	mv.setViewName("book_list");// book_list.jsp
		//////////////////////////////////////////////////////
		mv.addObject("deleteResult", result);
		mv.setViewName("delete_result"); //delete_result.jsp
		return mv;
	}
	
	@RequestMapping("/updateForm.do")
	public ModelAndView updateFunc(int bookNum) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("original", service.selectBook(bookNum));
		mv.setViewName("update_form");
		return mv;
	}
	
	@RequestMapping(value = "/update.do", method=RequestMethod.POST)
	public ModelAndView update(BookVO book) {
		int result = service.updateBook(book);
		ModelAndView mv = new ModelAndView();
		mv.addObject("bookNum", result);
		mv.setViewName("update_result");
		return mv;
	}
	
}