//Geoff Gill
//HW11
//This prorgam creats 3 d arrays 
public class MatrixSorter{
  public static void main(String arg[]){
    int mat3d[][][];
    mat3d=buildMat3d();
    show(mat3d);
    System.out.println("The smallest entry in the 3D matrix is "+
  			findMin(mat3d));
    System.out.println("After sorting the 3rd matrix we get");
    sort(mat3d[2]);
    show(mat3d);
   }
   //this method creates a randomized 3d array as specified
   public static int[][][] buildMat3d(){
       int mat3d[][][] = new int[9][7][3];
       //for statments incrementing size of array
       for (int slab = 0;slab<3;slab++){
           for(int row = 0;row<(3+2*(slab+1));row++){
               for(int column = 0; column<1+2+slab+row;column++){
                   mat3d[slab][row][column] = (int) Math.random()*99;
               }
           }
       }
       //return the array
       return (mat3d);
   }
   //this shows the random array in 3 blocks of 2d vectors
   public static void show(int[][][] mat3d){
       mat3d = new int[9][7][3];
       //for statments increment the printing of the values
       for (int slab = 0;slab<3;slab++){
           for(int row = 0;row<(3+2*(slab+1));row++){
               for(int column = 0; column<1+2+slab+row;column++){
                   if((!(mat3d[slab][row][column]==0))){
                       System.out.print((mat3d[slab][row][column])+" ");
                   }
               }System.out.println();
           }System.out.println();
       }System.out.println();
   }
   //this method find sthe minimum.
   public static int findMin(int[][][] mat3d){
       mat3d = new int[9][7][3];
       int min = 100;
       //it goes through every value in each slab and checks to see it tis less than the min
       //if it is it replaces the min
       for (int slab = 0;slab<3;slab++){
           for(int row = 0;row<(3+2*(slab+1));row++){
               for(int column = 0; column<1+2+slab+row;column++){
                   if((!(mat3d[slab][row][column]==0))&&(mat3d[slab][row][column]==0)){
                       min = mat3d[slab][row][column];
                   }
               }
           }
       }//it then returns the min
       return min;
    }
    //this method calls a second overloaded sort method to sort the 1d array
    public static int[][] sort (int[][] mat3d){
        for(int i =0; i<7;i++){
            mat3d[i] = sort(mat3d[i]);
        }
        return mat3d;
   }
   //this method sorts the one d array wichin the 2 d slabs
   public static int[] sort (int[] mat3d){
       int filler = 0;
       for(int i=0;i<9;i++){
           if(mat3d[i]!=0){
               for(int k=0;k<9;k++){
                   if(mat3d[k]!=0){
                       //uses filler to swap and order the array
                       if(mat3d[k]<mat3d[i])
                       filler = mat3d[i];
                       mat3d[i]=mat3d[k];
                       mat3d[k]=filler;
                   }
               }
           }
       }//returns an ordered array
       return mat3d;
   }
   
}
