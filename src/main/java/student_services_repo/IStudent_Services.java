package student_services_repo;

import student_model.Student;

import java.util.List;

public interface IStudent_Services {

    List<Student> getAllStudent();

    Student getStuById(int id);

    void updateStudent(Student student);

    void AddStudent(Student student);

    void deleteStudent(int id);
}
