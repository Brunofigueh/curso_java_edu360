import  java.util.Scanner;
public class OlaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		for( int i = 1; i <= 10; i++)
		{
			if(i==8)
				// irá parar caso i seja 8 o programa será parao 
				//break;
				continue;
				//(continue) quando i=8 pula essa repetição do laço
				System.out.println(i);
			
		}
	}

}
