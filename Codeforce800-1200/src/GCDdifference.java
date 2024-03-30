import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GCDdifference {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		for(int count=0;count<T;count++)
		{
			st = new StringTokenizer(br.readLine());
			int N=Integer.parseInt(st.nextToken());
			int L=Integer.parseInt(st.nextToken());
			int R=Integer.parseInt(st.nextToken());
			
			
			int ret[]=new int[N];
			boolean works=true;
			for(int i=N;i>0;i--)
			{
				int start=L/i*i;
				
				while(true)
				{
					if(start>=L&&start<=R)
					{
						ret[i-1]=start;
						break;
					}
					if(start>R)
					{
						works=false;
						break;
					}
					start+=i;
				}
				if(!works)
				{
					break;
				}
			}
			
			if(works)
			{
				System.out.println("Yes");
				for(int a:ret)
				{
					System.out.print(a+" ");
				}
			}
			else
			{
				System.out.println("No");
			}
				
		}
		
		
	}

}
