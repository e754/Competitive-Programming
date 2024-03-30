import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class cowfrisbee {
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
		int height[]=new int[N];
		st = new StringTokenizer(br.readLine());
		Stack<vertext> monotonic = new Stack<vertext>();
		long ret=0;
		for(int i=0;i<N;i++)
		{
			height[i]=Integer.parseInt(st.nextToken());
			
			while(!monotonic.isEmpty())
			{
//				System.out.println(i+" "+monotonic.peek().x);
				ret+=i-monotonic.peek().x+1;
				if(height[i]>monotonic.peek().y)
				{
					monotonic.pop();
				}
				else
				{
					break;
				}
			}
			monotonic.add(new vertext(i,height[i]));
		}
		System.out.println(ret);
		
	}
}