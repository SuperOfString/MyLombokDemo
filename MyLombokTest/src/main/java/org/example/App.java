package org.example;

import org.example.models.Person;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("========== 自定义注解处理器 ==========");

        Person person = new Person("张三", 28);
        System.out.println("姓名: " + person.getName());
        System.out.println("年龄: " + person.getAge());

        System.out.println(person.toString());
    }
}
