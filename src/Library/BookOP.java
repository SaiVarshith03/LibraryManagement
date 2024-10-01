package Library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookOP {
    List<Book> book = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public void addBook(Book b){
        book.add(b);
    }

    public void showBook(){
        for(Book ele : book){
            System.out.println("All Books are:");
            System.out.println(ele.toString());
        }
    }

    public void searchById() {
        System.out.println("Enter the Book ID:");
        int sno = input.nextInt();
        input.nextLine();
        boolean b = false;
        for (int i = 0; i < book.size(); i++) {
            if (sno == book.get(i).BookId) {
                System.out.println("Book Found");
                System.out.println("Book Name:" + book.get(i).BookName + "\nBook Id:" + book.get(i).BookId + "\nAuthor Name:" + book.get(i).AuthorName);
                b = true;
            }
        }
        if (!b) {
            System.out.println("Id not found");
        }

    }

}
