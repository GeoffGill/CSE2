public class ArrayMath{
  public static void main(String [] arg){
    double x[]={2.3, 3, 4, -2.1, 82, 23},
      y[]={2.3, 3, 4, -2.1, 82, 23},
      z[]={2.3, 13, 14},
      w[]={2.3, 13, 14, 12}, 
      v[],
      u[]={2.3, 12, 14};
    v=addArrays(x,y);
    System.out.println(display(x)+" \n  + " + display(y) + "\n   = " +display(v));
    System.out.println(display(x)+" \n  + " + display(z) + "\n   = " +display(addArrays(x,z)));
    System.out.println("It is " + equals(x,y)+" that "+display(x)+
                       " == "+display(y));
    System.out.println("It is " + equals(z,w)+" that "+display(z)+
                       " == "+display(w));
    System.out.println("It is " + equals(u,z)+" that "+display(u)+
                       " == "+display(z));
  }
  
  public static boolean equals(double[] first, double[] second){
    if (first.length != second.length){
      return false;
    }
    else{
      for (int j=0; j < first.length; j++){
        if (first[j] != second[j]){
          return false;
        }
      }
      return true;
    }
    
  }
  public static double[] addArrays(double[] firstTemp, double[] secondTemp){
    int longer;
    if (firstTemp.length< secondTemp.length){
      longer = secondTemp.length;
    }
    else {
      longer = firstTemp.length;
    }
    double first[]= new double[longer];
    double second[]=new double[longer];
    double sum[]=new double[longer];
    for (int j=0;j<longer;j++){
      first[j]=0;
      second[j]=0;
    }
    for (int j=0;j<firstTemp.length;j++){
      first[j]=firstTemp[j];
    }
    for (int j =0;j<secondTemp.length;j++){
      second[j]=secondTemp[j];
    }
    for (int j =0;j<longer;j++){
      sum[j]=first[j]+ second[j];
    }
    return sum;
    
  }
  
  
  public static String display(double [] x){
    String out="{";
    for(int j=0;j<x.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=x[j];
    }
    return out+"}";
  }
}