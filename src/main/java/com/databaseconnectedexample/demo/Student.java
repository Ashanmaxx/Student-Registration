package com.databaseconnectedexample.demo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "sdetails")
public class Student {

    @Id
    private  int sid;
    private String sname;
    private int gpa;

    public Student() {
    }

    public Student(int sid) {
        this.sid = sid;
    }

    public Student(String sname) {
        this.sname = sname;
    }

    public Student(int sid, String sname, int gpa) {
        this.sid = sid;
        this.sname = sname;
        this.gpa = gpa;
    }
}
