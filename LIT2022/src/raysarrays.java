import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class raysarrays {
	static class vertext  {
		public int x, y;
		public vertext(int a, int b) {
			x=a;
			y=b;
		}
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
  
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int matrix[][]=new int[N][N];
		LinkedList<vertext> list = new LinkedList<vertext>();
		int M=0;
		float xval=0f;
		float yval=0f;
		int retx;
		int rety;
		for(int i=0;i<N;i++)
		{
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<N;j++)
			{
				matrix[i][j]=Integer.parseInt(st.nextToken());
				for(int c=0;c<matrix[i][j];c++)
				{
					list.add(new vertext(i,j));
					xval+=i+1;
					yval+=j+1;
					
				}
				M+=matrix[i][j];
			}
		}
		System.out.println(xval);
		System.out.println(yval);
	
		xval= (float) Math.ceil(xval/M);
		yval= (float) Math.ceil(yval/M);;
		System.out.println(xval);
		System.out.println(yval);
		System.out.println(M);
		xval--;
		yval--;
		long ret=-1;
		for(vertext a:list)
		{
			ret+=(Math.abs(xval-a.x))+Math.abs(yval-a.y);
		}
		System.out.println(ret);
		
	}

}
