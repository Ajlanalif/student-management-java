package consoleversion;
import java.util.*;
public class StudentService {
    private List<Student> students =new ArrayList<>();
    public void addStudent(Student student){
        students.add(student);
    }
    public List<Student> getAllStudents(){
        return students;
    }
    public Student findStudent(int id){
        for(Student s: students){
            if(s.getId()==id){
                return s;
            }
        }
        throw new RuntimeException("Student not found");
    }
    public void deleteStudent(int id){
        Student student = findStudent(id);
        boolean removed = students.remove(student);

        if(!removed){
            throw new RuntimeException("Student not found");
        }
    }

}
