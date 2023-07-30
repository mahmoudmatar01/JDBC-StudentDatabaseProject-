package com.home.student_mangement;

import student_model.Student;
import student_services_repo.IStudent_Services;
import student_services_repo.StudentServices;


public class Home {
    public static void main(String[] args) {

        IStudent_Services iStudentServices=new StudentServices();
        Student student=new Student("Ahmed",1.6,1,"01227007298");
        iStudentServices.AddStudent(student);
        iStudentServices.updateStudent(new Student("Matar",3.4,1,"01111614941"));
        System.out.println(iStudentServices.getAllStudent());
        System.out.println(iStudentServices.getStuById(1));
        iStudentServices.deleteStudent(2);

    }
}
