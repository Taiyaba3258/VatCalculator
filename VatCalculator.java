
class TestFile
{
    double getVat(int amount)
    {
        return amount*5/100;
    }
}


public class VatCalculator {

    public static void main(String[] args)
    {
        TestFile t1= new TestFile();
        double d=t1.getVat(100000);
        
        System.out.println("Total Amount 100000");
        System.out.println("Vat 5% "+d);
        System.out.println("Commission 5% from vat "+ d*5/100);
        System.out.println("Government "+ d*95/100);
      
    }
    
}
