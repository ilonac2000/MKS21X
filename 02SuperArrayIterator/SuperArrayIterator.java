import java.util.Iterator;

public class SuperArrayIterator implements Iterator<String>{
    private SuperArray s;
    private int index;
 
    public SuperArrayIterator(int start,  SuperArray sa){
	index = start;
	s = sa;
    }

    public boolean hasNext(){
	return (index < sa.size());
}
