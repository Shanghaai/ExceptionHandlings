import java.util.Scanner;

class MyCalculator {
    /*
    * Create the method long power(int, int) here.
    */
    
    public static void main(String[] args) throws Exception
    {
    	Scanner sc = new Scanner(System.in);
        try
        {
        
        String n = sc.nextLine();
        String p = sc.nextLine();
       
        long data = power(Integer.parseInt(n),Integer.parseInt(p));
         /*  if(data==0)
            {
                 throw new ArithmeticException("n and p should not be zero.");
            }*/
        }
        catch(Exception e)
        {
            
            System.out.print("jjjjjjn: "+e.getLocalizedMessage());
        }
        sc.close(); 
            
    }
    public static long power(int n, int p) throws Exception
    {
        long rData =0;
            if(n<0 || p<0)
            {
                throw new ArithmeticException("n or p should not be negative.......");
            }
            else if(n==0 && p==0)
            {
                throw new ArithmeticException("n and p should not be zero.");
            }
            else
            {
                rData =1;
                for(int i=1;i<=p;i++)
                {
                   rData = rData*n;
                }
            }
            return rData;
    }
    
    
}
