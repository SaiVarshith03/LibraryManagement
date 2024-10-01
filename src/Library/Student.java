package Library;

import java.util.Scanner;

public class Student {
    String name;
    String regnum;

    Scanner input = new Scanner(System.in);

    public Student(){
        System.out.println("Enter Student Name:");
        this.name=input.nextLine();
        System.out.println("Enter Student Register Number:");
        this.regnum=input.nextLine();

    }
    @Override
    public String toString(){
        return this.name+"\t\t"+this.regnum;
    }
}
