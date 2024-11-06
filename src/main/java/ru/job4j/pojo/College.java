package ru.job4j.pojo;

import java.time.LocalDate;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Иванов Иван Иванович");
        student.setGroup("101");
        student.setAdmissionDate(LocalDate.of(2023, 9, 1));

        System.out.println("ФИО: " + student.getFullName());
        System.out.println("Группа: " + student.getGroup());
        System.out.println("Дата поступления: " + student.getAdmissionDate());
    }
}
