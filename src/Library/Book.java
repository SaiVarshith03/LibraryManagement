package Library;

import java.util.Scanner;

public class Book {
    String BookName;
    String AuthorName;
    int BookId;
    Scanner input = new Scanner(System.in);
    public Book(){
        System.out.println("Enter Book id:");
        this.BookId= input.nextInt();
        input.nextLine();
        System.out.println("Enter Book Name:");
        this.BookName = input.nextLine();
        System.out.println("Enter Author Name");
        this.AuthorName= input.nextLine();

    }
    @Override
    public String toString(){
        return "Book Id:"+this.BookId+"\t"+ "Book Name:"+this.BookName+"\t" +"Author:"+this.AuthorName;
    }
}
