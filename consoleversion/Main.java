package consoleversion;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentService();
        while (true) {
            System.out.println("\n==== Student Management System ====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Find Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("\n\tChoose Option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();
                    System.out.print("Enter Student Name: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.print("Enter Student Department: ");
                    String dept = sc.nextLine();
                    System.out.print("Enter Student CGPA: ");
                    double CGPA = sc.nextDouble();
                    Student s = new Student(id, name, dept, CGPA);
                    service.addStudent(s);
                    System.out.println("Student added Successfully!");
                    break;
                case 2:
                    for (Student st : service.getAllStudents()) {
                        System.out.println(st);
                    }
                    break;
                case 3:
                    System.out.println("Enter ID to search: ");
                    int searchId = sc.nextInt();
                    try{
                        Student found = service.findStudent(searchId);
                        System.out.println("Student Found! \n" + found);
                    }catch(RuntimeException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Enter ID to delete: ");
                    int deleteId = sc.nextInt();
                    try{
                        service.deleteStudent(deleteId);
                        System.out.println("Student Deleted Sucessfully!");
                    }catch(RuntimeException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    System.out.println("Exiting... ");
                    sc.close();
                    return;                    
                default:
                    break;
            }    
        }
        
    
    }
}
