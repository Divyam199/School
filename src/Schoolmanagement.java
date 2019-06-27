import model.Student;
import model.Teacher;
public class Schoolmanagement {



        public static void main(String[] args){



            //instantiation
            Student student = new Student("Akshit", 2);
            Teacher teacher=new Teacher();
            teacher.setName("gg");


            System.out.println(teacher.getName());
            System.out.println(student.getRollNo());
        }

        public void menu(){
            System.out.println("MENU");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Update Student");
            System.out.println("Enter your choice: ");
        }
    }

