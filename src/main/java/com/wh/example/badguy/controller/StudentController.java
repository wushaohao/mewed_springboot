package com.wh.example.badguy.controller;

import com.wh.example.badguy.bean.Student;
import com.wh.example.badguy.service.StudentServiceSVImpl;
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

    @GetMapping(value = "/Search")
    public Student getStudentById(@RequestParam(value = "id",required = false,defaultValue = "0") Integer id){
        log.info("getStudentById is star..");
        Student student = serviceSV.getStudentById(id);
        log.info("地址是:"+student.getAddress());
        return student;
    }

    @PostMapping
    public void addStudent(@Valid Student student, BindingResult bindingResult){
        if (bindingResult.hasErrors()){

        }

    }
}
