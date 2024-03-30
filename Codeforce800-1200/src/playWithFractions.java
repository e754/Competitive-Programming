import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class playWithFractions {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		for(int i=0;i<T;i++)
		{
			st = new StringTokenizer(br.readLine());
			long a=Long.parseLong(st.nextToken());
			long b=Long.parseLong(st.nextToken());
			long c=Long.parseLong(st.nextToken());
			long d=Long.parseLong(st.nextToken());

			if(a==0||c==0)
			{
				if(a+c==0)
				{
					System.out.println(0);
				}
				else
				{
					System.out.println(1);
				}
			}
			else if(a*d==b*c)
			{
				System.out.println(0);
			}
			else if((a*d)%(b*c)==0||(b*c)%(a*d)==0)
			{
				System.out.println(1);
			}
			else
			{
				System.out.println(2);
			}
			
		}
	}

}
