import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class chipGame {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		for(int i=0;i<N;i++)
		{
			st = new StringTokenizer(br.readLine());
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			if(a%2==0)
			{
				if(b%2==0)
				{
					System.out.println("Tonya");
				}
				else
				{
					System.out.println("Burenka");
				}
			}
			else
			{
				if(b%2==0)
				{
					System.out.println("Burenka");
				}
				else
				{
					System.out.println("Tonya");
				}
			}
		}
	}

}
