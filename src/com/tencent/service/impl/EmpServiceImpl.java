package com.tencent.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

//	@Transactional(rollbackForClassName = {"java.lang.Exception"})
	@Override
	public boolean transfer(int outEmpno, int inEmpno, double money) {
		//1. 转出之前判断余额是否充足
		Emp emp = empMapper.selectEmpByEmpno(outEmpno);
		//余额充足
		if(emp.getSal() >= money) {
			//2. 转出账号,扣钱
			Emp outEmp = new Emp();
			outEmp.setEmpno(outEmpno);
			outEmp.setSal(-money);
			int outResult = empMapper.updateEmpSal(outEmp);
			System.out.println(outEmpno + "※※※※※※※转出:转账结果※※※※※※※※※:" + outResult);
			
			//制造异常..........
			int i = 1/0;
			
			//3. 转入账号，加钱
			Emp inEmp = new Emp();
			inEmp.setEmpno(inEmpno);
			inEmp.setSal(money);
			int inResult = empMapper.updateEmpSal(inEmp);
			System.out.println(inEmpno + "※※※※※※※转入:转账结果※※※※※※※※※:" + inResult);
					
			return outResult >= 1 && inResult >= 1;
		}else {
			return false;
		}
	}
}
