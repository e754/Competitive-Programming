import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class makeitpermutation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		for(int count=0;count<T;count++)
		{
			st = new StringTokenizer(br.readLine());
			int N=Integer.parseInt(st.nextToken());
			int C=Integer.parseInt(st.nextToken());
			int D=Integer.parseInt(st.nextToken());
			long ret=0;
			PriorityQueue<Integer>set=new PriorityQueue<Integer>();
			HashSet<Integer>contain=new HashSet<Integer>();
			st = new StringTokenizer(br.readLine());
			for(int i=0;i<N;i++) {
				int a=Integer.parseInt(st.nextToken());
				
				if(!contain.contains(a))
				{
					set.add(a);
				}
				contain.add(a);
			}
			ret+=(N-set.size())*C;
			long runningCost=0;
			long optimal=Long.MAX_VALUE;
			int last=0;
			while(!set.isEmpty())
			{
				int curr=set.poll();
				runningCost+=Math.max(0,(curr-last-1))*D;
				optimal=Math.min((set.size())*C+runningCost, optimal);
				last=curr;
			}

			optimal=Math.min(contain.size()*C+D, optimal);
			System.out.println(ret+optimal);
		}
	}

}
