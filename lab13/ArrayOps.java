public class ArrayOps{
  public static void main(String[] args){
    int[][] bigArray = new int[5][];
    for (int j = 0; j< bigArray.length; j++){
      bigArray[j] = new int[j*3+5];
      for (int i=0;i<(j*3+5);i++){
        bigArray[j][i] = (int)(Math.random()*39);
      }
    }
    System.out.println("The array before sorting:");
    displayArray(bigArray);
    System.out.println("");
    rowSorter(bigArray);
    System.out.println("The array after sorting:");
    displayArray(bigArray);
  }
  
  public static void displayArray(int[][] array2display){
    for (int j =0;j<5;j++){
      for (int i=0;i<(j*3+5);i++){
        System.out.print(array2display[j][i] + " ");
      }
      System.out.println("");
    }
  }
  public static void rowSorter(int[][] array2sort){
    for (int h = 0; h < array2sort.length; h++) { // Select the first row in the slab
      int temp;
      for (int i = 0; i < array2sort[h].length; i++) { // Focus on each item one at a time.
        int smallestValue = i; // Declare the item we're focusing on as the smallest item
        for (int j = i; j < array2sort[h].length; j++) { // Cycle through the rest of the list...
          if (array2sort[h][j] < array2sort[h][smallestValue]) { // ...looking for any smaller values
            smallestValue = j; // Then replace smallestValue with the current smallest value.
          }
        } // When we break out of this, smallestValue should point to the smallest item remaining in the array
        temp = array2sort[h][i];
        array2sort[h][i] = array2sort[h][smallestValue];
        array2sort[h][smallestValue] = temp;
      }
    }
  }
}