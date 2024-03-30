import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class formalStatement {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		for(int count=0;count<T;count++)
		{
			 st = new StringTokenizer(br.readLine());
			int N=Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			int starting[]=new int[N];
			for(int i=0;i<N;i++)
			{
				starting[i]=Integer.parseInt(st.nextToken());
			}
			st = new StringTokenizer(br.readLine());
			boolean ret=true;
			int ideal[]=new int[N];
			for(int i=0;i<N;i++)
			{
				int a=Integer.parseInt(st.nextToken());
				ideal[i]=a;

			}
			for(int i=0;i<N;i++)
			{
				if(starting[i]>ideal[i])
				{
					ret=false;
				}
				else if(starting[i]!=ideal[i])
				{
					if(i==N-1)
					{
						if(ideal[N-1]-ideal[0]>1)
						{
							ret=false;
						}
					}
					else
					{
						if(ideal[i]-ideal[i+1]>1)
						{
							ret=false;
						}
					}
				}
			}
			if(ret)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
			
			
		}
	}

}
