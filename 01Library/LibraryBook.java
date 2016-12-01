public abstract class LibraryBook extends Book implements Comparable<LibraryBook>{
	private String callNumber;
	public LibraryBook(String person, String name, String number, String call){
		super(person, name, number);
		callNumber = call;
    }
    public String getCN(){
		return callNumber;
    }
    public void setCN(String CN){
		callNumber = CN;
    }
  	abstract public void checkout(String patron, String due);
    abstract public void returned();
    abstract public String circulationStatus();
    public int compareTo(LibraryBook b){
    	return callNumber.compareTo(b.getCN());
    }
    public String toString(){
    	return super.toString() +  ", " + circulationStatus() + ", " + callNumber;
    }
	/*public static void main(String[]args){
    LibraryBook t = new LibraryBook("a", "b", "1230132", "1249394139420");
    System.out.println(t);
    System.out.println(t.getTitle());
    System.out.println(t.getAuthor());
    System.out.println(t.getISBN());
    System.out.println(t.getCN());
    t.setTitle("NEW");
    t.setAuthor("NEW");
    t.setISBN("NEW");
    t.setCN("NEW");
    System.out.println(t);
    }*/
}
