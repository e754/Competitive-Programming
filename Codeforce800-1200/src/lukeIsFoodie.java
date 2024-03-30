import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class lukeIsFoodie {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		for(int i=0;i<T;i++)
		{
			st = new StringTokenizer(br.readLine());
			int N=Integer.parseInt(st.nextToken());
			int X=Integer.parseInt(st.nextToken());
			int currmin=Integer.MAX_VALUE;
			int currmax=Integer.MIN_VALUE;
			int ret=0;
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<N;j++)
			{
				int a=Integer.parseInt(st.nextToken());
				currmin=Math.min(a, currmin);
				currmax=Math.max(a,currmax);
				if(currmax-currmin>(X*2))
				{
					ret++;
					currmin=a;
					currmax=a;
				}
			}
			System.out.println(ret);
		}
	}

}
