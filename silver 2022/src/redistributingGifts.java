import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class redistributingGifts {
	static class edge implements Comparable<edge>
	{
		int i,v;
		public edge(int i,int v) {this.i=i;this.v=v;}
		public int compareTo(edge o) {return v-o.v;}
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		PriorityQueue<edge>[] connectTo = new PriorityQueue[N];
		for(int i=0;i<N;i++)
		{
			connectTo[i]=new PriorityQueue<edge>();
		}
		boolean[][]connectFrom=new boolean[N][N];
		for(int i=0;i<N;i++)
		{
			st = new StringTokenizer(br.readLine());
			boolean nomore=false;
			for(int j=0;j<N;j++)
			{
				int a=Integer.parseInt(st.nextToken());
				if(!nomore)
				{
					connectTo[i].add(new edge(a-1,j));
					connectFrom[i][a-1]=true;
				}
				if(a-1==i)
				{
					nomore=true;
				}
			}
		}
		for(int i=0;i<N;i++)
		{
			int sol=i;
			while(!connectTo[i].isEmpty())
			{
				edge canidate=connectTo[i].poll();
				if(connectFrom[canidate.i][i])
				{
					sol=canidate.i;
					break;
				}
			}
			System.out.println(sol+1);
		}
	}

}
