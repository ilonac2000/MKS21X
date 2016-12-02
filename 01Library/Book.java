public class Book{
    private String author;
    private String title;
    private String ISBN;
    public Book(){
	author = "author";
    title = "title";
    ISBN = "number";
    }
<<<<<<< HEAD
    public Book(String person, String name, string number){
=======
    public Book(String person, String name, String number){
>>>>>>> d5e609618c472221a7ecefe1c94af387ad703bc9
	author = person;
	title = name;
	ISBN = number;
    }
    public String getAuthor(){
	return author;
    }
    public String getTitle(){
	return title;
    }
    public String getISBN(){
	return ISBN;
    }
    public void setAuthor(String a){
	author = a;
    }	
    public void setTitle(String t){
	title  = t;
    }	
    public void setISBN(String i){
	ISBN  = i;
    }
    public String toString(){
	return title + ", " + author + ", " + ISBN;
    }
<<<<<<< HEAD
public static void main(String[]args){
    Book a = new Book();
    Book b = new Book("a", "b", "12012310241204");
    System.out.println(a);
    System.out.println(b);
}
=======
    /*public static void main(String[]args){
    Book s = new Book();
    Book t = new Book("a", "b", "1230132");
    System.out.println(s);
    System.out.println(t);

}*/
>>>>>>> d5e609618c472221a7ecefe1c94af387ad703bc9
}
