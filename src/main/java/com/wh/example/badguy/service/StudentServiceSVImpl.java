package com.wh.example.badguy.service;

import com.wh.example.badguy.bean.Student;
import com.wh.example.badguy.repertoties.StudentRepertoties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:wuhao
 * @Description:操作Student服务层
 * @Date:17/8/29
 */
@Service
public class StudentServiceSVImpl {

    @Autowired
    private StudentRepertoties repertoties;

    /**
     * 根据id 获取学生信息
     * @param id
     * @return
     */
    public Student getStudentById(Integer id){
        return repertoties.getOne(id);
    }

    /**
     * 根据性别获取学生信息
     * @param sex
     * @return
     */
    public List<Student> getStudentBySex(String sex){
        return repertoties.findAllBySex(sex);
    }
}
