package Star_Patteren;

public class Example2_star 
{
	public static void main(String[] args)
	{
		
		//*****
		//****
		//***
		//**
		//*
		
		int star=5;
		
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=star; j++)
			{
				System.out.print("*");
			}
			
			System.out.println("");
			
			star--;
		}
	
	}

}
