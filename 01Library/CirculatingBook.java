public class CirculatingBook extends LibraryBook{
	private String currentHolder;
	private String dueDate;
	public CirculatingBook(String person, String name, String number, String call){
		super(person, name, number, call);
    }
    public String getCH(){
		return currentHolder;
    }
    public void setCH(String holder){
		currentHolder = holder;
    }
    public String getDD(){
		return dueDate;
    }
    public void setDD(String dues){
		dueDate = dues;
    }
    public void checkout(String patron, String due){
    	currentHolder = patron;
    	dueDate = due;
    }
    public void returned(){
    	currentHolder = null;
    	dueDate = null;
    }
    public String circulationStatus(){
    	if (currentHolder != null){
    		return currentHolder +  " must return by: " + dueDate;
    	}
    	else{
    		return "book available on shelves";
    	}
    }
    public String toString(){
    	if (currentHolder == null){
    		return super.toString() + " not owned by anyone ";
    	}
    	else{
    	return super.toString() + " owned by: " + currentHolder + "\n Must be return: " + dueDate;
    	}
    }
   /* public static void main(String[]args){
    CirculatingBook t = new CirculatingBook("a", "b", "1230132", "1249394139420");
    System.out.println(t);
    System.out.println(t.getTitle());
    System.out.println(t.getAuthor());
    System.out.println(t.getISBN());
    System.out.println(t.getCN());
    t.checkout("Minnie", "December");
    System.out.println(t.getCH());
    System.out.println(t.getDD());
    System.out.println(t.circulationStatus());
    t.returned();
    System.out.println(t.circulationStatus());
    }*/
}
