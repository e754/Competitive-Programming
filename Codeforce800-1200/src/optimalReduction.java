import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class optimalReduction {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		for(int i=0;i<T;i++)
		{
			st = new StringTokenizer(br.readLine());
			int N=Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			long max=-1;
			boolean sorted=true;
			boolean ret=true;
			long min=Integer.MAX_VALUE;
			for(int j=0;j<N;j++)
			{
//				System.out.println(sorted+" "+ret+" "+max);
				long a=Long.parseLong(st.nextToken());
				
				if(sorted)
				{
					if(a>=max)
					{
						max=a;
					}
					else
					{
						sorted=false;
						min=a;
					}
				}
				else
				{
					if(a>min)
					{
						ret=false;
					}
					else
					{
						min=a;
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
