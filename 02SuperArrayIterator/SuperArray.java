import java.util.Iterator;

public class SuperArray{
    private String[] data;
    private int size;
 
  //Constructor for empty list with initialized Capacity
  public SuperArray(int initialCapacity){
   if (initialCapacity < 0){
    throw new IllegalArgumentException("Initial Capacity can not be negative");
   }
   else{
   size = 0;
   data = new String[initialCapacity];
    }
  }

  //Default constructor
  public SuperArray(){
   size = 0;
   data = new String[10];
    }
   
  //Returns the number of elements in this list. 
  public int size(){
   return size;
    }

  //Appends the specified element to the end of this list.
  //It returns true (add this part)
  public boolean add(String n){
   if (size < data.length){
       data[size] = n;
       size++;
   }
   else{
       grow();
       data[size] = n;
       size++;
   } 

   return true;
     }
  //Increases the capacity of this SuperArray instance to double
  private void grow(){
    String[] news = new String[data.length * 2];
    for (int i = 0; i < size(); i++){
      news[i] = data[i];
    }
   data = news;
    }

  public String toString(){
   String result = "[";
   for (int i = 0; i < size(); i++){
      if (i != size() - 1){
       result += data[i] + ", ";
      }
      else{
        result += data[i]; 
      }
    }
    result += ']';
    return result;
    }

    //Returns the element at the specified position in this list.
    public String get(int index){
      if (index < 0 || index >= size()){
        throw new IndexOutOfBoundsException("get index out of bounds");
      }
      else{
      return data[index];
    }
  }

    /*format the super array like this :   [ 1, 8, 23, 99, -4, 5, _, _, _, _]  
     (capacity is 10, but only 6 are used)
     commas between... square bracket start/end and no comma at end.
     unused slots should be printed as _ (underscores) */
  public String toStringDebug(){
   String result = toString();
   if ((size() - 1 != 0 && data.length - 1 != 0) || data.length - 1 != 0){
      result = result.replace("]", "");
      for (int i = 0; i < data.length; i++){
          if (i + 1 == data.length){
            result += "_";
      }
          else {if (i > size()){
            result += "_,";
      }
    }
    }
      result += ']';
    }
   return result;   
  }

  //Removes all of the elements from this list.
  public void clear(){
    size = 0;
  }

  //Returns true if this list contains no elements.
  public boolean isEmpty(){
    return (size == 0);
  }

  //Replaces the element at the specified position in this list with the specified element. 
  //Returns the value of the element replaced. 
  public String set(int index, String element){
    if(index < 0 || index >= size()){
  throw new IndexOutOfBoundsException("index of set is out of bounds");
     }
    else{
  String n = data[index];
  data[index] = element;
  return n;
    }
  }

  //Inserts the specified element at the specified position in this list. 
  //Shifts the element currently at that position (if any)
  //and any subsequent elements to the right (adds one to their indices).
  public void add(int index, String element){
    size += 1;
    if(index < 0 || index > size()){
      throw new IndexOutOfBoundsException("index of add is out of bounds");
     }
    else{
    if (data.length + 1 == size){
      grow();
    }
    String[]x = new String[data.length];
    for(int i = 0; i < index; i++) {
        x[i] = data[i];
      }
    for(int i = index + 1; i < data.length; i++){
        x[i] = data[i - 1];
      }
      x[index] = element;
      data = x;
  }
}

  //Returns an array containing all of the elements in this list in proper sequence 
  //(from first to last element).
  public String[] toArray(){
    String[] result = new String[data.length];
    result = data;
    return result;
  }

  //Returns the index of the first occurrence of the specified element in this list, 
  //or -1 if this list does not contain the element.
  public int indexOf(String i){
    int r = 0;
    for (int x = 0; x < size(); x++){
      if (data[x] == i){
        r = x;
        return r;
       }
      else { 
       r = -1;
    } 
     }
    return r;
    }

  //Returns the index of the last occurrence of the specified element in this list, 
  //or -1 if this list does not contain the element.
  public int lastIndexOf(String i){
    int r = 0;
    if (data[r] == i && size() > 0){
      return r;
    }
    else {
      for (int x = 1; x<size(); x++){
      if (data[size() - x] == i){
       r = size() - x;
       return r;
      }
      }
    }
    return -1;
  }
  
  //Removes the element at the specified position in this list.  
  //Shifts any subsequent elements to the left
  // (subtracts one from their indices).
  //The value returned is the value of the element removed.
  //public int remove(int index)
  public  String  remove(int index){
    if(index < 0 || index >= size()){
      throw new IndexOutOfBoundsException("remove index is out of bounds");
    }
    else{
    String[]x = new String[data.length];
    String n = data[index];
    for(int i = 0; i < index; i++){
        x[i] = data[i];
    }
    for(int i = index + 1; i < size() - 1; i++){
      x[i] = data[i + 1];
    }
    return n;
    }
  }
    public static class SuperArrayIterator implements Iterator<String>{
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
}
