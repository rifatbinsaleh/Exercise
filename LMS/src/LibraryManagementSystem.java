import java.io.*;
import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please input your name....!");
        String x=input.nextLine();
        System.out.println("You are welcome- "+x);


        Library library = new Library("This is your Library....", "Location:- Dhaka,Bangladsesh.");



        Book book1 = new Book("Java Programming", "Kabir ahmed");
        Book book2 = new Book("C Programming", "Rakib Roshan");
        library.addBook(book1);
        library.addBook(book2);

        System.out.println("\n");

        Librarian librarian = new Librarian("JAKIR", "DHAKA", "245");
        System.out.println("\n");
        librarian.addBook(book1);
        librarian.removeBook(book2);

        System.out.println("\n");

        Student student = new Student("Rifat", "Dhaka", "4846");
        library.addMember(student);

        System.out.println("\n");

        Faculty faculty = new Faculty("Aywon", "Noakhali", "332");
        librarian.addMember(faculty);

        System.out.println("\n");

        library.displayBooks();

    }
}
