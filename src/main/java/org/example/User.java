package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class User {


    private String fullName;
    private String email;
    private int age;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User(String fullName, String email, int age) {
        this.fullName = fullName;
        this.email = email;
        this.age = age;
    }


    @Override
    public String toString() {
        return "User{" +
                "fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        List<Map<String, Object>> userList = new ArrayList<>();


        Map<String, Object> user1 = new HashMap<>();
        user1.put("fullName", "user1");
        user1.put("email", "user1@gmail.com");
        user1.put("age", 30);
        userList.add(user1);


        Map<String, Object> user2 = new HashMap<>();
        user2.put("fullName", "user2");
        user2.put("email", "user2@gmail.com");
        user2.put("age", 90);
        userList.add(user2);

        Map<String, Object> user3 = new HashMap<>();
        user3.put("fullName", "user3");
        user3.put("email", "user3@gmail.com");
        user3.put("age", 25);
        userList.add(user3);

        Map<String, Object> user4 = new HashMap<>();
        user4.put("fullName", "user4");
        user4.put("email", "user4@gmail.com");
        user4.put("age", 11);
        userList.add(user4);

        for (Map<String, Object> user : userList) {
            int age = (int) user.get("age");
            if (age < 18) {
                System.out.println(user);
            }
        }

    }

}
