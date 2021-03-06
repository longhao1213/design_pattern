package com.lh.prototype;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Copyright (C), 2006-2010, ChengDu ybya info. Co., Ltd.
 * FileName: Person.java
 *
 * @author lh
 * @version 1.0.0
 * @Date 2020/11/18 14:46
 */
public class Person implements Cloneable, Serializable {

    private String name;

    private int age;

    private List<String> list = new ArrayList<>();

    public Person(){
        System.out.println("构造函数被调用");
    }

    public Person clone() throws CloneNotSupportedException {
        return (Person) super.clone();
    }

    public Person deepClone() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(this);

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        return (Person) ois.readObject();
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

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
}