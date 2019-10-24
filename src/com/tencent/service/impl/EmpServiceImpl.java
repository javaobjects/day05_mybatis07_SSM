package com.tencent.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.tencent.dao.EmpMapper;
import com.tencent.pojo.Emp;
import com.tencent.service.IEmpService;

@Service("empService")
public class EmpServiceImpl implements IEmpService {

//	@Autowired @Qualifier("empService")//默认根据类型匹配，可以结合@Qualifier注解注明依赖对象的引用名称
	
	@Resource(name = "empMapper")//默认根据名称匹配
	private EmpMapper empMapper;
	
	@Override
	public Emp selectEmpByEmpno(Integer empno) {
		Emp emp = empMapper.selectEmpByEmpno(empno);
		return emp;
	}
}
