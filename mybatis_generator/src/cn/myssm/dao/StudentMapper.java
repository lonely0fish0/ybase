package cn.myssm.dao;

import cn.myssm.domain.Student;

public interface StudentMapper {
    int deleteByPrimaryKey(Long sid);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Long sid);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}