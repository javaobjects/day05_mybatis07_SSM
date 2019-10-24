package com.tencent.dao;

import com.tencent.pojo.Emp;

public interface EmpMapper {

	//<select id="selectEmpByEmpno" parameterType="int" resultType="com.tencent.pojo.Emp">
	public Emp selectEmpByEmpno(int empno);
}
