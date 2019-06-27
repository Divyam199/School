import java.util.Scanner;
import model.Student;
import model.Teacher;
public class Schoolmanagement {



        public static void main(String[] args){
            Schoolmanagement sm = new Schoolmanagement();
            sm.menu();




            //instantiation
            Student student = new Student("Akshit", 2);
            Teacher teacher=new Teacher();
            teacher.setName("gg");


            System.out.println(teacher.getName());
            System.out.println(student.getRollNo());
        }

        public void menu(){
            int a=0,b,c;
            while(a==0){
            Scanner scan= new Scanner(System.in);

            System.out.println("Press 1 for Menu");

                b= scan.nextInt();

                if(b==1)    {
                    System.out.println("MENU");
                    System.out.println("1. Add Student");
                    System.out.println("2. Remove Student");
                    System.out.println("3. Update Student");
                    System.out.println("Enter your choice: ");

                    c= scan.nextInt();

                    switch(c){
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


                }
                else{
                    System.out.println("You Have Exited The Program");
                    break;
                }
            }
        }
}









