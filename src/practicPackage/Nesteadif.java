package practicPackage;

public class Nesteadif 
{
	public static void main(String[] args) 
		{
			int age = 15;
			int weight=45;
			
			
			if(age> 18)    //outer cond
			{
				//cond-true
				System.out.println("check the weight now");
				
				if(weight>50)   //inner cond
				   {
					//cond-true
					System.out.println("donate the blood");
				   }
				else
				   {
					//cond-false
					System.out.println("cant donate the blood-weight criteria");
				   }
			}
			else
			{
				//cond-false
				System.out.println("not eligible-due to age criteria");
				
			}
			
			
		}

	}


