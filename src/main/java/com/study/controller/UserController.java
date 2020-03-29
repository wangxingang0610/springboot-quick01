package com.study.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@ConfigurationProperties(prefix = "person")
public class UserController {

    private String name;
    private int age;
    private boolean sex;
    private Date birthday;
    private Map<String, Object> location;
    private String[] hobbie;
    private List<String> skills;


    @Value("${com.config}")
    private String config;

    @RequestMapping("/method")
    public String method(){
        return "配置:" + config;
    }


    @RequestMapping("/list")
    public String list() {
        return "list 7777 999 ss";
    }

    @RequestMapping("/say")
    public String say() {
        return "name=" + name + ", age=" + age + ", sex="+ sex + ",birthday=" +
                birthday + ",location=" + location.toString() + ",hobbie=" + Arrays.toString(hobbie) + ",skills=" + skills;
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

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Map<String, Object> getLocation() {
        return location;
    }

    public void setLocation(Map<String, Object> location) {
        this.location = location;
    }

    public String[] getHobbie() {
        return hobbie;
    }

    public void setHobbie(String[] hobbie) {
        this.hobbie = hobbie;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }
}
