package com.csi.dao;

import com.csi.domain.Student;
import com.csi.domain.Teacher;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * @author 张旭
 * @version 1.0
 * @date 2021/3/28 13:25
 */
@Repository
public interface TeacherDao {
    List<Teacher> findByLike(Map<String,Object> map);
    Teacher findById(String teaId);
    void insert(Teacher teacher);
    void updateByID(Teacher student);
}