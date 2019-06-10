package pack1;
public class flowcontrol 
{
	public static void main(String[] args) 
	{
		int a=500,b=50,c=80,d=1000;
		if (a>b) {
			if (a>c){
				if (a>d){
					System.out.println("A is a big Number");
				    }
				
				
			    else {
			        System.out.println("D is  big Number") ;
			    }
				
					
			}
			else {
				System.out.println("C is a big Number");
			}
		}
		else {
			System.out.println("B is a big nimber");
		}
		
	}
}	

