package hey.tdd.junit;
import java.util.Scanner;
public class Hey {

	public static void main(String[] args) {
		String x=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter x value");
		char y[]=x.toCharArray();
		int size=x.length();
		char key='a';
		int i=0;
		String res="";
		while(i!=size)
		{
			if(y[i]!=key)
			{
				res=res+y[i];
				
			}
			++i;
		}
		System.out.println(res);
	}

}
