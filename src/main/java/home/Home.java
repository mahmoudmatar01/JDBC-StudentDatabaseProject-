package home;
import Models.Student;
import Services.IStudentServices;
import Services.StudentServicesImpl;

public class Home {
    public static void main(String[] args) {

        IStudentServices iStudentServices = new StudentServicesImpl();
//        Student student = new Student("Mahmoud",3.1,"01128673348");
        Student student =  Student.builder()
                .name("Mahmoud")
                .gpa(3.1)
                .phone("01128673348")
                .build();
        iStudentServices.AddStudent(student);
//        iStudentServices.updateStudent(new Student("Matar",3.4,1,"01111614941"));
//        System.out.println(iStudentServices.getAllStudent());
//        System.out.println(iStudentServices.getStuById(4));
//        iStudentServices.deleteStudent(2);


    }
}





































// To connect in sql server management studio :-

//        String connectionString="jdbc:sqlserver://DESKTOP-UQA266F;Database=CourseraDb;IntegratedSecurity=true;encrypt=true;trustServerCertificate=true";
//        try{
//            try(Connection con= DriverManager.getConnection(connectionString)){
//                System.out.println("Connection success");
//            }
//        }catch (SQLException e){
//            System.out.println("Error connection to the database");
//            e.printStackTrace();
//        }