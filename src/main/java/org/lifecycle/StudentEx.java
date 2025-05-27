package org.lifecycle;

import lombok.*;

/// Implementing bean life cycle using xml
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentEx {
    private int age;
    private String name;

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public void init(){
        System.out.println("Inside init method");
    }

    public void destroy(){
        System.out.println("Inside destroy method");
    }
}
