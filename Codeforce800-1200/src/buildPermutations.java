import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class buildPermutations {
	public static int NextSquare(double h)
	{
		int root=(int) Math.sqrt(h);
		if(root*root==h)
		{
			return (int)h;
		}
		else
		{
			return (root+1)*(root+1);
		}
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		System.out.println(NextSquare(1.0));
//		System.out.println(NextSquare((double)c));
		int T = Integer.parseInt(st.nextToken());
		for(int i=0;i<T;i++)
		{
			st = new StringTokenizer(br.readLine());
			int a=Integer.parseInt(st.nextToken());
			int k=a-1;
			int h;
			int ret[]=new int[a];
			while(true)
			{
				h=NextSquare((double)k);
				for(int j=h-k;j<=k;j++)
				{
					ret[j]=h-j;
				}
				k=h-k-1;
				if(k<0)
				{
					break;
				}
			}
			for(int c:ret)
			{
				System.out.print(c+" ");
			}
			System.out.println();
		}
	}
}
