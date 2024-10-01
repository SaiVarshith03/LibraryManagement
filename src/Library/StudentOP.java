package Library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentOP {
    Scanner input =new Scanner(System.in);
    List<Student> st =new ArrayList<>();

     public void addStudent(Student s){
         boolean a= true;
         for (Student student : st) {
                /*use String "equals()" methods to compare Two strings not "=="*/
             if (s.regnum.equals(student.regnum)) {
                 System.out.println("Student is already registed");
                 a = false;
             }

         }
         if (a){
             System.out.println("Student is registed sucessfully");
             st.add(s);
         }
     }

     public void showallStudent(){
         System.out.println("Student name\tStudent Regnum");
         for (Student student : st) {
             System.out.println(student.regnum);
         }
     }
}
