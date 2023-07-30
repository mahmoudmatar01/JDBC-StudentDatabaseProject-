package home;

import Models.Student;
import Services.IStudentServices;
import Services.StudentServicesImpl;


public class Home {
    public static void main(String[] args) {

        IStudentServices iStudentServices = new StudentServicesImpl();
        Student student = new Student("Menna", 3.2, 1, "015576898");
        iStudentServices.AddStudent(student);
//        iStudentServices.updateStudent(new Student("Matar",3.4,1,"01111614941"));
//        System.out.println(iStudentServices.getAllStudent());
        System.out.println(iStudentServices.getStuById(4));
//        iStudentServices.deleteStudent(2);

    }
}
