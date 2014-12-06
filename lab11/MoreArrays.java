import java.util.Scanner;

public class MoreArrays{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        
        System.out.print("Enter 10 integers: ");
        for(int i=0; i<10; i++)array1[i] = scan.nextInt();
        
        int max = array1[0];
        int min = array1[0];
        int sum = 0;
        for(int i=0; i<10; i++){
            if(array1[i]>max)max = array1[i];
            if(array1[i]<min)min = array1[i];
            sum += array1[i];
            array2[i] = array1[9-i];
        }
        System.out.println("The lowest entry: " + min);
        System.out.println("The highest entry: " + max);
        
        for(int i=0; i<10; i++)System.out.println("\t" + array1[i] + "\t" + array2[i]);
    }
    
}