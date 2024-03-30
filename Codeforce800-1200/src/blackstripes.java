import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class blackstripes {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		for(int i=0;i<T;i++)
		{
			st = new StringTokenizer(br.readLine());
			int N=Integer.parseInt(st.nextToken());
			int K=Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			String s=st.nextToken();
			char[] a=s.toCharArray();
			int runningSum=0;
			int charging=0;
			int ret=Integer.MAX_VALUE;
			for(int j=0;j<N;j++)
			{
				charging++;
				if(a[j]=='B')
				{
					runningSum++;
				}
				if(charging>K)
				{
					if(a[j-K]=='B')
					{
						runningSum--;
					}
				}
				if(charging>=K)
				{
					ret=Math.min(K-runningSum, ret);
				}
			}
			System.out.println(ret);
		}
		
	}

}
