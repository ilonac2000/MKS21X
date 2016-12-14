public class Sorts{
  public static String name(){
    return "09.Cherepakhina.Ilona"; 
  }

  /**Selection sort of an int array. 
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void selectionSort(int[] data){ 
    for (int i = 0; i < data.length; i++){
	  int index = i;
	  for (int j = 0; j < data.length; j++){
	      if (data[index] < data[j]){
		        index = j;
        int min = data[index];
        data[index] = data[i];
        data[i] = min;
          }
	  }  
    }
  }
 public static void insertionSort(int[] data){ 
     for (int i = 0; i < data.length; i++){
	 int index = data[i];
	 for (int j = i - 1; j  > 0; j--){
	     if (data[j] > index){
		 if (j == 1 || data[j - 1] < index){
		     int temp = data[j];
		     data[j] = index;
		     index = temp;
		 }
	     }		 
	 }
     }
 }

     
public static void main(String []args){   
        int[] a = {64,25,12,22,11};
        insertionSort(a);
        for(int i:a){
            System.out.print(i);
            System.out.print(", ");
    }
  }
}
