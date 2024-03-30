import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class daggers {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		
		int Q = Integer.parseInt(st.nextToken());
		PriorityQueue<Integer>runningCoords=new PriorityQueue<Integer>();
		for(int i=0;i<Q;i++)
		{
			st = new StringTokenizer(br.readLine());
			int a=Integer.parseInt(st.nextToken());
			runningCoords.add(a);
		}
		int curr[]=new int[Q];
		boolean[] impossible=new boolean[Q];
		int[] timeLeft=new int[Q];
		int[]wait=new int[Q];
		while(!runningCoords.isEmpty())
		{
			int next=runningCoords.poll();
			for(int i=0;i<Q;i++)
			{
				if((Q-runningCoords.size())<=i+1)
				{
					if(!impossible[i])
					{
						if(next-curr[i]<=(i+1)) //we can reach from where we r
						{
							if(next-curr[i]==timeLeft[i]) //perfect, we get there on time
							{
								curr[i]=next;
								timeLeft[i]=i+1;
							}
							else if(next-curr[i]<timeLeft[i]) //we can reach it, but we have extra time to burn
							{
								timeLeft[i]-=(next-curr[i]);
								curr[i]=next;
							}
							else if(next-curr[i]>timeLeft[i]) //we can get there, but not within this time
							{
								wait[i]+=timeLeft[i];
								timeLeft[i]=i+1-(next-curr[i]);
								curr[i]=next;
							}
						}
						else//we cant reach it
						{
							impossible[i]=true;
						}
						
						
					}
				}	
			}
		}
		for(int i=0;i<Q;i++)
		{
			if(impossible[i])
			{
				System.out.println(-1);
			}
			else
			{
				System.out.println(curr[i]);
				if(N-curr[i]<=(i+1)) //we can reach from where we r
				{
					if(N-curr[i]==timeLeft[i]) //perfect, we get there on time
					{
						System.out.println(wait[i]+N);
					}
					else if(N-curr[i]<timeLeft[i]) //we can reach it, but we have extra time to burn
					{
						System.out.println(wait[i]+N);
					}
					else if(N-curr[i]>timeLeft[i]) //we can get there, but not within this time
					{
						System.out.println(wait[i]+N+timeLeft[i]);
					}
				}
				else
				{
					System.out.println(-1);
				}
			}
		}

			
	}

}
