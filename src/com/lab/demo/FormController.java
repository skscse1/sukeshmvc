package com.lab.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormController {
	
	@RequestMapping(value="/formsubmit",method=RequestMethod.GET)
	public ModelAndView getFormData()
	{
		ModelAndView model=new ModelAndView("submit");
		
		return model;
	}
	
	@RequestMapping(value="/sucessForm",method=RequestMethod.POST)
	public ModelAndView submitData(@ModelAttribute("Data") RegisterData Data)
	{
		ModelAndView model= new ModelAndView("success");
		
		/*ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		RegisterDAO r=(RegisterDAO)ctx.getBean("fdao");
		
		r.saveData(Data);*/
		
		return model;
		
	}
	

}
