import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class line {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		for(int i=0;i<T;i++)
		{
			st = new StringTokenizer(br.readLine());
			Long N=Long.parseLong(st.nextToken());
			st = new StringTokenizer(br.readLine());
			String a=st.nextToken();
			char[] direction=a.toCharArray();
			PriorityQueue<Long> pQueue = new PriorityQueue<Long>(Collections.reverseOrder());
			long ret=0;
			for(int j=0;j<N;j++)
			{
				if(direction[j]=='L')
				{
					if(j<=(N/2)-1)
					{
						if(N-j-1!=j)
						{
							pQueue.add(N-j-1-j);
							ret+=j;
						}
						else
						{
							ret+=j;
						}
					}
					else
					{
						
						ret+=j;
					}
				}
				else
				{
					if(j<=(N/2)-1)
					{
						ret+=N-j-1;
					}
					else
					{
						if(N-j-1!=j)
						{
							pQueue.add(j-(N-j-1));
							ret+=N-j-1;
						}
						else
						{
							ret+=N-j-1;
						}
					}
				}
			}
			int c=0;
			while(!pQueue.isEmpty())
			{
				ret+=pQueue.poll();
				System.out.print(ret+" ");
				c++;
			}
			for(int o=c;o<N;o++)
			{
				System.out.print(ret+" ");
			}
			System.out.println();
		}
	}

}
