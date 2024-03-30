import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class parityshuffling {
	static class vertext {
		public int l, r;
		public vertext(int l, int r) {
			this.l=l;
			this.r=r;
		}
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		for(int count=0;count<T;count++)
		{
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			int[]arr=new int[N];
			for(int i=0;i<N;i++)
			{
				arr[i]=Integer.parseInt(st.nextToken());
			}
			if(N==1)
			{
				System.out.println(0);
			}
			else
			{
				System.out.println(N-1);
				System.out.println(1+" "+N);
				
				if((arr[0]+arr[N-1])%2==0)
				{
					arr[0]=arr[N-1];
				}
				else
				{
					arr[N-1]=arr[0];
				}
				
				
				for(int i=1;i<N-1;i++)
				{
					if((arr[i]+arr[0])%2==0)
					{
						System.out.println((i+1)+" "+N);
					}
					else
					{
						System.out.println((1)+" "+(i+1));
					}
				}
			}
		}
	}

}
