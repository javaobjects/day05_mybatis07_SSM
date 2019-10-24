package com.tencent.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tencent.pojo.Emp;
import com.tencent.service.IEmpService;

@Controller
public class EmpController {

//	@Autowired @Qualifier("empService")//默认根据类型匹配，可以结合@Qualifier注解注明依赖对象的引用名称
	
	@Resource(name = "empService")//默认根据名称匹配
	private IEmpService empService;
	
	@RequestMapping("/getEmpByEmpno")
	public String getEmpByEmpno(Model model,Integer empno) {
		//1. 调用service方法，获取
		Emp emp = empService.selectEmpByEmpno(empno);
		
		//2. 将emp保存到request作用域
		model.addAttribute("emp",emp);
		
		return "index";
	}
}
