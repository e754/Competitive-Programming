import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class underGroundCompetition {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		for(int t=0;t<T;t++)
		{
			st = new StringTokenizer(br.readLine());
			int N=Integer.parseInt(st.nextToken());
			int K=Integer.parseInt(st.nextToken());
			int R=Integer.parseInt(st.nextToken())-1;
			int C=Integer.parseInt(st.nextToken())-1;
			char grid[][]=new char[N][N];
			int intercept=C-R;
			grid[R][C]='X';
			for(int i=0;i<N;i++)
			{
				for(int j=0;j<N;j++)
				{
					if((j-(i+intercept))%K==0)
					{
						grid[i][j]='X';
					}
					else
					{
						grid[i][j]='.';
					}
					System.out.print(grid[i][j]);
				}
				System.out.println();
			}
			
			
			
		}
	}

}
