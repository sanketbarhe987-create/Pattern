package SeptPrAC;

public class Pattern1 {
	public static void main(String[] args) {
		
		int sp=1;
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=7;j++)
			{
				if((i>1)&&(i+j)==6)
				{
					for(int p=1;p<=sp;p++)
					{
						System.out.print(" ");
						j++;
					}
					sp=sp+2;
				}
				System.out.print("*");
			}
			System.out.println();
		}
			
	}		
}
