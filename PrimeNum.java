import java.io.*;
public class PrimeNum 
{
	public static void main(String[] args) 
	{
		String prime_Array = "";

		for(int i=2; i<=200; i++){

			int isPrime=1; //BOOL
			for(int j=2; j<= Math.sqrt(i); j++){

				if(i%j == 0){
					isPrime=0;
					break;
				}//NOT A Prime Number
			}// END for
			

			if(isPrime == 1){
				System.out.println( i );
			}		
		}
	}
}
