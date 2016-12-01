public class ReferenceBook extends LibraryBook{
	private String collection;
	public ReferenceBook(String person, String name, String number, String call, String collect){
		super(person, name, number, call);
		collection = collect;
	}
	public String getCollection(){
		return collection;
    }
    public void setCollection(String c){
		collection = c;
    }
    public void checkout(String patron, String due){
    	throw new IllegalArgumentException("cannot check out a reference book");
    }
    public void returned(){
    	throw new IllegalArgumentException("reference book could not have been checked out -- return impossible");
    }
    public String circulationStatus(){
    	return "non-circulating reference book";
    }
    public String toString(){
    	return super.toString() +  ", " + collection;
    }
    /*public static void main(String[]args){
    ReferenceBook t = new ReferenceBook("a", "b", "1230132", "1249394139420", "abc");
    System.out.println(t);
    System.out.println(t.getCollection());
    t.setCollection("NEW");
    System.out.println(t);
    //t.checkout("abc", "5");
    //t.returned();
  	//System.out.println(t.circulationStatus());
    }*/
    }
