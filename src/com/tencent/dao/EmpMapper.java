package com.tencent.dao;

import com.tencent.pojo.Emp;

public interface EmpMapper {

	//<select id="selectEmpByEmpno" parameterType="int" resultType="com.tencent.pojo.Emp">
	public Emp selectEmpByEmpno(int empno);
	
	//<update id="updateEmpSal" parameterType="com.tencent.pojo.Emp">
	public int updateEmpSal(Emp emp);
}
