public class Book{
    private String author;
    private String title;
    private String ISBN;
    public Book(){
	System.out.println("you haven't included a book!");
    }
    public Book(String person, String name, string number){
	author = person;
	title = name;
	ISBN = number;
    }
    public string getAuthor(){
	return author;
    }
    public string getTitle(){
	return title;
    }
    public string getISBN(){
	return ISBN;
    }
    public void setAuthor(String a){
	author = a;
    }	
    public void setAuthor(string t){
	title  = t;
    }	
    public void setAuthor(string i){
	ISBN  = i;
    }
    public String toString(){
	return title + ", " + author + ", " + ISBN;
    }
public static void main(String[]args){
    Book a = new Book();
    Book b = new Book("a", "b", "12012310241204");
    System.out.println(a);
    System.out.println(b);
}
}
