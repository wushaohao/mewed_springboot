package com.wh.example.badguy.controller;

import com.wh.example.badguy.bean.Student;
import com.wh.example.badguy.exceptions.ExceptionHandler;
import com.wh.example.badguy.repertoties.StudentRepertoties;
import com.wh.example.badguy.service.StudentServiceSVImpl;
import com.wh.example.badguy.util.Result;
import com.wh.example.badguy.util.ResultUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.BindException;

/**
 * @Author:wuhao
 * @Description:操作Student控制类
 * @Date:17/8/29
 */
@RestController
@RequestMapping("/Student")
public class StudentController {

    private Logger log = LoggerFactory.getLogger(StudentController.class);

    @Autowired
    private StudentServiceSVImpl serviceSV;

    @Autowired
    private StudentRepertoties studentRepertoties;

    @GetMapping(value = "/Search")
    public Student getStudentById(@RequestParam(value = "id",required = false,defaultValue = "0") Integer id){
        log.info("getStudentById is star..");
        Student student = serviceSV.getStudentById(id);
        log.info("地址是:"+student.getAddress());
        return student;
    }

    @PostMapping(value = "/addStudent")
    public void addStudent(@Valid Student student, BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            ResultUtils.error("",bindingResult.getFieldError().getDefaultMessage());
        }

        student.setAge(student.getAge());
        student.setAddress(student.getAddress());
        student.setName(student.getName());
        student.setSex(student.getSex());

        studentRepertoties.save(student);
    }


}
