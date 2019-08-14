package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    private Integer studentId;
    private String name;
    private Integer age;
    private Integer number;

    public Student() {

    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getNumber(Integer number) {
        return this.number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
