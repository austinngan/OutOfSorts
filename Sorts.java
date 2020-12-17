public class Sorts{
  /**Bubble sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data){
    int temp=0;
    for (int i=data.length;i>0;i--){
      temp=0;
      for (int y=0;y<data.length-1;y++){
        if (data[y]>data[y+1]){
          temp=data[y+1];
          data[y+1]=data[y];
          data[y]=temp;
        }
      }
    }
   }

   public static void selectionSort(int[] data){
     int min=0;
     int temp=0;
     int replacedIndex=0;
     for (int i=0;i<data.length-1;i++){
       min=data[i];
       temp=data[i];
       replacedIndex=i;
       for (int y=i;y<data.length;y++){
         temp=data[y];
         if (temp<min){
           min=temp;
           replacedIndex=y;
         }
       }
       data[replacedIndex]=data[i];
       data[i]=min;
     }
   }
}
