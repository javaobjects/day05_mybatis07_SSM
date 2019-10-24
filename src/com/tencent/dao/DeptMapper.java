package com.tencent.dao;

import com.tencent.pojo.Dept;

public interface DeptMapper {

	public Dept selectDeptByDeptno(int deptno);
}
