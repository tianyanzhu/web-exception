package com.july.controller;

import com.july.enums.AjaxStatus;
import com.july.enums.ErrorCode;
import com.july.exception.BusinessException;
import com.july.tools.JsonResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {

	@RequestMapping("/index.jhtml")
	public ModelAndView getIndex(HttpServletRequest request) throws Exception {
		ModelAndView mav = new ModelAndView("index");
		return mav;
	}

	@RequestMapping("/exceptionForPageJumps.jhtml")
	public ModelAndView exceptionForPageJumps(HttpServletRequest request) throws Exception {
		throw new BusinessException(ErrorCode.NULL);
	}
	
	@RequestMapping(value="/businessException.json", method=RequestMethod.POST)
	@ResponseBody  
	public String businessException(HttpServletRequest request) {
		throw new BusinessException(ErrorCode.NULL);
	}
	
	@RequestMapping(value="/otherException.json", method=RequestMethod.POST)
	@ResponseBody  
	public String otherException(HttpServletRequest request) throws Exception {
		throw new Exception();
	}

	@RequestMapping(value = "/getTeacherTeaching.json", method = RequestMethod.POST)
	@ResponseBody
	public String getTeacherTeaching(HttpServletRequest request)throws Exception {
		List<Object> retlist =new ArrayList<Object>();
		List<Map> list =null;
		for(int i=0;i<list.size();i++){

		}
		return "abc";
	}

	@RequestMapping(value = "/getTeacherTeaching1.json", method = RequestMethod.POST)
	public JsonResult getTeacherTeaching1(HttpServletRequest request)throws Exception {
		List<Object> retlist =new ArrayList<Object>();
		List<Map> list =null;
		for(int i=0;i<list.size();i++){
		}
		return new JsonResult(AjaxStatus.ERROR, "没有数据");
	}

}
