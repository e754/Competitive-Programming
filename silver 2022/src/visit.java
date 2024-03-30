import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class visit {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int next[]=new int[N];
		long value[]=new long[N];
		long ret=0;
		for(int i=0;i<N;i++)
		{
			st = new StringTokenizer(br.readLine());
			next[i]=Integer.parseInt(st.nextToken())-1;
			value[i]=Integer.parseInt(st.nextToken());
			ret+=value[i];
		}
		int visited[]=new int[N];
		int r=-1;
		Arrays.fill(visited, -1);
		for(int i=0;i<N;i++)
		{
			if(visited[i]==-1)
			{
				r++;
				int turtle=i;
				int rabbit=i;
				boolean cycle=false;
				while(true)
				{
					turtle=next[turtle];
					rabbit=next[rabbit];
					rabbit=next[rabbit];
					if(visited[turtle]==-1)
					{
						visited[turtle]=r;
					}
					if(visited[rabbit]==-1)
					{
						visited[rabbit]=r;
					}
					if(visited[turtle]!=r||visited[rabbit]!=r)
					{
						break;
					}
					
					if(rabbit==turtle)
					{
						cycle=true;
						break;
					}
				}
				if(cycle)
				{
					int cyclestart=turtle;
					long minval=value[turtle];
					while(true)
					{
						turtle=next[turtle];
						minval=Math.min(value[turtle], minval);
						if(turtle==cyclestart)
						{
							break;
						}
					}
					ret-=minval;
				}
				
			}
		}
		
		System.out.println(ret);
	}
}
