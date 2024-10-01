import Library.*;
import java.util.Scanner;


public class Main{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("-----*****Welcome to the Library Management*****-----");
        int choice;
        BookOP ob = new BookOP();
        StudentOP stud = new StudentOP();
        do{
            System.out.println("---Choose One of the options below---");
            System.out.println("Press '1' to Add new Book");
            System.out.println("Press '2' to Show all Books");
            System.out.println("Press '3' to Search a Book by Id");
            System.out.println("Press '4' to Register a Student");
            System.out.println("Press '5' to Show all Registered Students");
            System.out.println("Press '6' to Check-out book");
            System.out.println("Press '7' to Check-in book");
            System.out.println("Press '0' to Exit the Application");
            System.out.println("----------------------------");
            System.out.println("Enter your choice:");
            choice = input.nextInt();
            switch (choice){
                case 1 :
                    Book b = new Book();
                    ob.addBook(b);
                    break;

                case 2 :
                    ob.showBook();
                    break;
                case 3 :
                    ob.searchById();
                    break;
                case 4 :
                    Student s1 =new Student();
                    stud.addStudent(s1);
                    break;
                case 5 :
                    stud.showallStudent();
                    break;
                case 6 :
                    break;
                default:
                    break;
            }

        }while(choice!=0);
    }
}