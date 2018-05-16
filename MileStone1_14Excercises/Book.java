/**
 * Created by pujithapabbaraju on 16/05/18.
 */
/*
CCreate a class called Author is designed as follows:
It contains:
• Three private instance variables: name (String), email (String), and gender (char of either ‘m’ or ‘f’). • One constructor to initialize the name, email and gender with the given values.
And, a class called Book is designed as follows:
It contains:
• Four private instance variables: name (String), author (of the class Author you have just created), price (double), and qtyInStock (int). Assuming that each book is written by one author.
• One constructor which constructs an instance with the values given.
• Getters and setters: getName(), getAuthor(), getPrice(), setPrice(), getQtyInStock(), setQtyInStock(). Again there is no setter for name and author.
Write the class Book (which uses the Author class written earlier).
Try:
1. Printing the book name, price and qtyInStock from a Book instance. (Hint: aBook.getName())
2. After obtaining the “Author” object, print the Author (name, email & gender) of the book.

 */
public class Book {
    String name;
    Author author;
    double price;
    int qtyInStock;
    Book(String name, Author author, double price, int qtyInStock){
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }
    String getName(){
        return this.name;
    }
    Author getAuthor(){
        return this.author;
    }
    double getPrice(){
        return this.price;
    }
    void setPrice(double price){
        this.price =price;
    }
    int getQtyInStock(){
        return qtyInStock;
    }
    void setQtyInStock(int qtyInStock){
        this.qtyInStock = qtyInStock;
    }

    public static void main(String args[]){
        Author author = new Author("herbert schildt","herbert@gmail.com",'m');
        Book b = new Book("Java 8", author, 500.30,5);
        System.out.println("Book name: " + b.getName());
        System.out.println("Book price: "+ b.getPrice());
        System.out.println("Qty in stock" + b.qtyInStock);
        Author author1 = b.getAuthor();
        System.out.println("Author name :" + author1.name);
        System.out.println("Author email : "+ author1.email);
        System.out.println("Author gender :" + author1.gender);

    }
}
