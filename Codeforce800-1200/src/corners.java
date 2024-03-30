import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;


public class corners {
	static class vertext {
		public int x, y;
		public vertext(int x, int y) {
			this.x=x;
			this.y=y;
		}
	}
	static int N;
	static int M;
	static char grid[][];
	static int visited[][];
	static int r;
	static LinkedList<vertext> visitList;
	static LinkedList<Integer> size;
	public static void floodfill(vertext curr)
	{
		if(fit(curr)&&grid[curr.x][curr.y]=='0'&&visited[curr.x][curr.y]==-1)
		{
			
			visited[curr.x][curr.y]=r;
			size.set(r, size.get(r)+1);
			floodfill(new vertext(curr.x-1,curr.y));
			floodfill(new vertext(curr.x+1,curr.y));
			floodfill(new vertext(curr.x,curr.y+1));
			floodfill(new vertext(curr.x,curr.y-1));
			
			floodfill(new vertext(curr.x+1,curr.y+1));
			floodfill(new vertext(curr.x+1,curr.y-1));
			
			floodfill(new vertext(curr.x-1,curr.y+1));
			floodfill(new vertext(curr.x-1,curr.y-1));

		}
	}
	public static boolean fit(vertext curr)
	{
		if(curr.x>-1&&curr.y>-1&&curr.x<N&&curr.y<M)
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		for(int count=0;count<T;count++)
		{
			st = new StringTokenizer(br.readLine());
			N= Integer.parseInt(st.nextToken());
			M= Integer.parseInt(st.nextToken());
			int totalone=N*M;
			grid=new char[N][M];
			visited=new int[N][M];
			size=new LinkedList<Integer>();
			size.clear();
			for(int i=0;i<N;i++)
			{
				st = new StringTokenizer(br.readLine());
				String a=st.nextToken();
				grid[i]=a.toCharArray();
				Arrays.fill(visited[i], -1);
			}
			r=-1;
			int largestcontinous=0;
			
			for(int i=0;i<N;i++)
			{
				for(int j=0;j<M;j++)
				{
					if(grid[i][j]=='0'&&(visited[i][j]==-1))
					{
						r++;
						size.add(0);
						floodfill(new vertext(i,j));
						
						largestcontinous=Math.max(largestcontinous, size.get(r));
						totalone-=size.get(r);
					}
				}
			}
			
			
			if(largestcontinous==0)
			{
				
				System.out.println(totalone-2);
			}
			else if(largestcontinous==1)
			{
				System.out.println(totalone-1);
			}
			else
			{
				System.out.println(totalone);
			}
			
		}
		
	}

}
