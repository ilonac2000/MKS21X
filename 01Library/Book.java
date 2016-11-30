public class Book{
    private string author;
    private string title;
    private string ISBN;
    public Book(){
	System.out.println("you haven't included a book!");
    }
    public Book(string person, string name, string number){
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
    public void setAuthor(string a){
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

}
