package com.tencent.test;

import java.io.IOException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.tencent.dao.EmpMapper;
import com.tencent.pojo.Emp;

public class TestMybatis {

	public static void main(String[] args) throws IOException {
		//1.获取SqlSessionFactory接口
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("sqlMapConfig.xml"));
		
		//2. 获取SqlSession接口
		SqlSession session = factory.openSession();
		
		//2.获取EmpDao
		EmpMapper empMapper = session.getMapper(EmpMapper.class);
		
		//3.调用查询
		Emp emp = empMapper.selectEmpByEmpno(8888);
		System.out.println(emp);
		
		
		
	}

}
