import java.util.Iterator;

public class SuperArrayIterator implements Iterator<String>{
    private SuperArray s;
    private int index;
 
    public SuperArrayIterator(SuperArray sa){
	index = 0;
	s = sa;
    }
    public boolean hasNext(){
	return (index < s.size());
    }
    public String next(){
    if(hasNext()){
        index++;
        return s.get(index - 1);
        }
    else{
        throw new IndexOutOfBoundsException();
    }
    }
    public void Remove(){
	throw new UnsupportedOperationException("Can not remove");
    }
    public Iterator<String> iterator(){
        return new SuperArrayIterator(s);
    }
}
