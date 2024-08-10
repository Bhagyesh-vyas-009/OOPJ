/*Declare a class called book having author_name as private data member.
Extend book class to have two sub classes called book_publication &
paper_publication. Each of these classes have private member called
title. Write a complete program to show usage of dynamic method
dispatch (dynamic polymorphism) to display book or paper publications
of given author.Use command line arguments for inputting data.*/


class Book
{
    private String author_name;

    Book(String a_name)
    {
        author_name=a_name;
    }
    Book()
    {

    }
    public void print(){
        System.out.println("Author of book is: "+author_name);
    }
    
}

class Book_publication extends Book
{
    private String title;

    Book_publication(String t)
    {
        title=t;
    }
    public void print()
    {
        System.out.println("Title of Book : "+title);
    }
}

class Paper_publication extends Book
{
    private String title;

    Paper_publication(String t)
    {
        title=t;
    }

    public void print(){
        System.out.println("title of book is: "+title);
    }
}

public class P6_2 
{
    
    public static void main(String[] args) 
    {
        Book b=new Book(args[0]);
        // b.print();
        // b = new Book_publication(args[1]);
        // b.print();
        // b = new Paper_publication(args[2]);
        // b.print();

        Book_publication b1=new Book_publication(args[1]);
        Paper_publication p=new Paper_publication(args[2]);

        Book ref;

        ref=b;

        ref.print();

        ref=b1;

        ref.print();

        ref=p;

        ref.print();

    }
}
