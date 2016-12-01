public class Book{
    private String author;
    private String title;
    private String ISBN;
    public Book(){
	author = "author";
    title = "title";
    ISBN = "number";
    }
    public Book(String person, String name, String number){
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
    /*public static void main(String[]args){
    Book s = new Book();
    Book t = new Book("a", "b", "1230132");
    System.out.println(s);
    System.out.println(t);

}*/
}
