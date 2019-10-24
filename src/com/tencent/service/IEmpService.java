package com.tencent.service;

import com.tencent.pojo.Emp;

public interface IEmpService {

	public Emp selectEmpByEmpno(Integer empno);
}
