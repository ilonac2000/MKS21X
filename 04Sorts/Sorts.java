public class Sorts{
  public static String name(){
    return "09.Cherepakhina.Ilona"; 
  }

  /**Selection sort of an int array. 
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void selectionSort(int[] data){ 
      for (int i = 0; i < data.length - 1 ; i++){
	  min = data[i];
	  for (int j = 0; j < data.length - 1; j++){
	      if (min > data[j]);
		  min = data[j];
	  }
      }

}
