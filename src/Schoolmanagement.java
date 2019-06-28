import model.Student;
import model.Teacher;

import java.util.Scanner;

public class Schoolmanagement {

    int first;

    public static void main(String[] args) {


        //instantiation
        Student student = new Student("Akshit", 2);
        Teacher teacher = new Teacher();
        teacher.setName("gg");


        System.out.println(teacher.getName());
        System.out.println(student.getRollNo());



        Schoolmanagement sm = new Schoolmanagement();
        sm.menu();


    }

    public void menu() {//menu
        int loops = 0;
        while (loops == 0) {

            Scanner sca = new Scanner(System.in);
            int a;
            System.out.println("Press 1 to continue 0 to exit");
            a = sca.nextInt();
            if (a == 1) {
                System.out.println("MENU");
                System.out.println("1. Add Student");
                System.out.println("2. Remove Student");
                System.out.println("3. Update Student");
                System.out.println("Enter your choice: ");
                Scanner s=new Scanner(System.in);
                int first;
                System.out.println("Enter your choice");
                first= s.nextInt();

                switch (first) {

                    case 1:
                        System.out.println("Adding Student");
                        break;
                    case 2:
                        System.out.println("Removing Student");
                        break;
                    case 3:
                        System.out.println("Updating Student");
                        break;
                    default:
                        System.out.println("Invalid choice");
                        break;

                }
            } else {
                break;
            }
        }
    }


}
