package com.wh.example.badguy.repertoties;

import com.wh.example.badguy.bean.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

/**
 * @Author:wuhao
 * @Description:JPA实现类仓库
 * @Date:17/8/29
 */
public  interface StudentRepertoties extends JpaRepository<Student,Integer>{

    Student getOne(Integer id);

    List<Student> findAllBySex(String sex);

}
