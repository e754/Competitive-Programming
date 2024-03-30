import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class connectTwoBarns {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		for(int count=0;count<T;count++)
		{
			st = new StringTokenizer(br.readLine());
			int N=Integer.parseInt(st.nextToken());
			int M=Integer.parseInt(st.nextToken());
			LinkedList<Integer>[] paths = new LinkedList[N];
			for(int i=0;i<N;i++)
			{
				paths[i]=new LinkedList<Integer>();
			}
			for(int i=0;i<M;i++)
			{
				st = new StringTokenizer(br.readLine());
				int a=Integer.parseInt(st.nextToken())-1;
				int b=Integer.parseInt(st.nextToken())-1;
				paths[a].add(b);
				paths[b].add(a);
			}
			int regionCode[]=new int[N];
			Arrays.fill(regionCode, -1);
			LinkedList<Integer> regions=new LinkedList<Integer>();
			int r=-1;
			for(int i=0;i<N;i++)
			{
				if(regionCode[i]==-1)
				{
					r++;
					regions.add(i);
					LinkedList<Integer> visitList=new LinkedList<Integer>();
					visitList.add(i);
					while(!visitList.isEmpty())
					{
						int curr=visitList.pop();
						regionCode[curr]=r;
						for(int a:paths[curr])
						{
							if(regionCode[a]!=r)
							{
								visitList.add(a);
								regionCode[curr]=r;
							}
						}
					}
				}
			
			}
			int mostrecentof[]=new int[r];
			Arrays.fill(mostrecentof, -1);
			int regionDistance[][]=new int[N][N];
			for(int i=0;i<r+1;i++)
			{
				for(int j=0;j<N;j++)
				
				
			}
			
			
		}
	}

}
