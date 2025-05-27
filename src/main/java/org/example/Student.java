package org.example;

import lombok.*;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private int studentId;
    private String studentName;
    private String studentAddress;

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                '}';
    }
}