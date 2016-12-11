/*
 *  Implements Fermats Primality Test to return whether or not a number is 
 *  prime.
 */
import java.math.BigInteger;
import java.util.*;

public class FermatsPrimalityTest 
{
	
	public static boolean fermat(int data)
	{
		Random rand = new Random();
		int a;
		BigInteger A;
		BigInteger DATA;
		BigInteger isAPRIME;
		
		
		for(int i = 0; i < 10; i++)
		{
			a = 2 + rand.nextInt(data - 2);
			DATA = BigInteger.valueOf(data);
			A = BigInteger.valueOf(a);
			isAPRIME = A.modPow(DATA.subtract(BigInteger.ONE), DATA);
			
			if(!isAPRIME.equals(BigInteger.ONE))
				return false;
		}
		
		return true;
		/*while(isAPrime == true && iteration < 10)
		{
			a = 2 + rand.nextInt(data - 2);
			A = BigInteger.valueOf(a);
			TESTCASE = A.pow(data-1);
			DATA = BigInteger.valueOf(data);
			BigInteger fermat = TESTCASE.mod(DATA);
			int testAgainst = fermat.intValue();
			isAPrime = (testAgainst == 1 % data);
			iteration ++;
		}*/
		
		//return isAPrime;
	}
 
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in); 
        int input = sc.nextInt();
        int a[] = new int[input];
        
        for (int i = 0; i < input; i ++)
        {
            a[i] = sc.nextInt();
        }
        
        for(int data : a)
        {
            if(data ==1)
            {
                System.out.println("Not prime");
            }
            else if(data == 2 || data == 3)
            {
            	System.out.println("Prime");
            }
            else if(data % 2 == 0)
            {
            	System.out.println("Not prime");
            }
            else if(fermat(data) == true) 
            {  
                System.out.println("Prime");
            }
            else
            {
                System.out.println("Not prime");
            }
        }
    }
}