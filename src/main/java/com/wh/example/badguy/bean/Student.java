package com.wh.example.badguy.bean;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @Author:wuhao
 * @Description:Student类
 * @Date:17/8/29
 */
@Entity
public class Student implements Serializable{

    private static final long serialVersionUID= 1l;
    @Id
    @GeneratedValue
    private int  id ;

    @NotBlank
    private String name;

    @NotNull(message = "年龄必传")
    private int age;

    private String address;

    private String sex;

    //
    public Student() {
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
