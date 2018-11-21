package com.boot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.boot.entity.Emp;

/**
 * 可以在这里使用@Mapper
 * 或者在启动类使用@MapperScan扫描
 */
public interface EmpMapper {

	/**
	 * @Select 查询
	 * @Result 修饰返回的结果集，关联实体类属性和数据库字段一一对应，如果实体类属性和数据库属性名保持一致，就不需要这个属性来修饰。
	 * @Insert 插入
	 * @Update 修改，也可以直接传入对象
	 * @Delete 删除
	 */
	@Select("SELECT t.* FROM emp_bean t")
	List<Emp> findAll();
	
}
