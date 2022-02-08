package com.example.crud1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="crud_table")
public class Student {


    @Id
    @GeneratedValue

    private int id;
    private String name;
    private String emailid;
    private String Gender;
    private String Language;

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String language) {
        Language = language;
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

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }



    @Override
    public String toString() {
        return "Student{" +

                ", name='" + name + '\'' +
                ", emailid='" + emailid + '\'' +
                ", Gender='" + Gender + '\'' +
                ", Language='" + Language + '\'' +
                '}';
    }
}
