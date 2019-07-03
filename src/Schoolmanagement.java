import model.Student;

import java.util.Scanner;

public class Schoolmanagement {

    public static void main(String[] args) {
        Schoolmanagement sm = new Schoolmanagement();

       // about reference variables and object
        Student s1, s2, s3;

        s1= new Student();
        s2 = new Student();
        s3  = s1;
        s3 = new Student("abc",2);

        s1.setName("a");
        s2.setName("b");

        s3 = new Student("a2", 2);

        System.out.println(s1.getName());
        System.out.println(s2.getName());
        System.out.println(s3.getName());
        System.out.println(s3.getRollNo());


    }

    public void menu() {
        int a = 0, b, c;
        while (a == 0) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Press 1 for Menu or 0 to Exit");

            b = scan.nextInt();

            if (b == 1) {
                System.out.println("MENU");
                System.out.println("1. Add Student");
                System.out.println("2. Remove Student");
                System.out.println("3. Update Student");
                System.out.println("Enter your choice: ");

                c = scan.nextInt();

                switch (c) {
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
                        System.out.println("Wrong Selection");
                        break;
                }


            } else {
                System.out.println("You Have Exited The Program");
                break;
            }
        }
    }
}
