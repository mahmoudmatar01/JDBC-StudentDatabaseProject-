package Services;

import Models.Student;

import java.util.List;

public interface IStudentServices {

    List<Student> getAllStudent();

    Student getStuById(int id);

    void updateStudent(Student student);

    void AddStudent(Student student);

    void deleteStudent(int id);
}
