public class Arithmetic{
    
    public static void main(String[] args) {
    int nSocks = 3;              //Pairs of socks
    double sockCosts$ = 2.58;  //Cost of pair
    
    int nGlasses=6;              //Number of glasses
    double glassCost$=2.29;      //cost per glass
    
    int nEnvelopes = 1;          //number of envelopes
    double envelopeCost$ = 3.25;
    
    double taxMultiplyer = 1.06;    //tax on products
    
    //Total cost calculations below
    double tCostSocks = nSocks * sockCosts$*taxMultiplyer * 100.0;
    double tCostGlasses = nGlasses * glassCost$ * taxMultiplyer * 100.0;
    double tCostEnvelopes = nEnvelopes * envelopeCost$ * taxMultiplyer * 100.0;
    
    
    //double to int conversion
    int fCostSocks =  (int) tCostSocks;
    int fCostGlasses = (int) tCostGlasses;
    int fCostEnvelopes = (int) tCostEnvelopes;
    
    //Tax Calculation
    double sockTax =  fCostSocks * .06;
    double glassTax = fCostGlasses * .06;
    double envelopeTax =  fCostEnvelopes *.06;
    int iSockTax = (int) sockTax;
    int iGlassTax = (int) glassTax;
    int iEnvelopeTax = (int) envelopeTax;

    
    System.out.println("Item:       Socks");
    System.out.println("Quantity:   " + nSocks);
    System.out.println("Cost/Sock:   " + sockCosts$);
    System.out.println("The total cost of the items before tax was $" + (nSocks *sockCosts$));
    System.out.println("The total cost of the items after tax was $" + fCostSocks/100.00);
    System.out.println("The total sales tax was $." + iSockTax);
     System.out.println();
    System.out.println("----------------------------------------------------------------------");
    System.out.println();
    System.out.println("Item:       Glasses");
    System.out.println("Quantity:   " + nGlasses);
    System.out.println("Cost/Glass:  " + glassCost$);
    System.out.println("The total cost of the items before tax was $" + (nGlasses *glassCost$));
    System.out.println("The total cost of the items after tax was $" + fCostGlasses/100.0);
    System.out.println("The total sales tax was $." + iGlassTax);
    System.out.println();
    System.out.println("----------------------------------------------------------------------");
    System.out.println();
    System.out.println("Item:       Envelopes");
    System.out.println("Quantity:     " + nEnvelopes);
    System.out.println("Cost/Envelope: " + envelopeCost$);
    System.out.println("The total cost of the items before tax was $" + (nEnvelopes *envelopeCost$));
    System.out.println("The total cost of the items after tax was $" + fCostEnvelopes/100.0);
    System.out.println("The total sales tax was $." + iEnvelopeTax);
    }
    
}