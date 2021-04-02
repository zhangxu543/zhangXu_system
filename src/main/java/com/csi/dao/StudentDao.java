package com.csi.dao;

import com.csi.domain.Student;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author 张旭
 * @version 1.0
 * @date 2021/3/28 13:25
 */
@Repository
public interface StudentDao {
    Student findById(String stuId);
    void insert(Student student);
    void updateByID(Student student);
    List<Student> findByLike(Map<String,Object> map);
}