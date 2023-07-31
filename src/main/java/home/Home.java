package home;

import Models.Student;
import Services.IStudentServices;
import Services.StudentServicesImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Home {
    public static void main(String[] args) {

        IStudentServices iStudentServices = new StudentServicesImpl();
        Student student = new Student("Menna", 3.2, 1, "015576898");
        iStudentServices.AddStudent(student);
//        iStudentServices.updateStudent(new Student("Matar",3.4,1,"01111614941"));
//        System.out.println(iStudentServices.getAllStudent());
        System.out.println(iStudentServices.getStuById(4));
//        iStudentServices.deleteStudent(2);
//
//        String connectionString="jdbc:sqlserver://DESKTOP-UQA266F;Database=CourseraDb;IntegratedSecurity=true";
//        try{
//            try(Connection con= DriverManager.getConnection(connectionString)){
//                System.out.println("Connection success");
//            }
//        }catch (SQLException e){
//            System.out.println("Error connection to the database");
//            e.printStackTrace();
//        }
    }
}
