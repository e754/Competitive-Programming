import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class goodSubArr {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		int a=0;
		for(int count=0;count<T;count++)
		{
			st = new StringTokenizer(br.readLine());
			int N=Integer.parseInt(st.nextToken());
			int arr[]=new int[N];
			st = new StringTokenizer(br.readLine());
			int left=0;
			int ret=0;
			for(int i=0;i<N;i++)
			{
				arr[i]=Integer.parseInt(st.nextToken());
			}
			for(int i=0;i<N;i++)
			{
				if(arr[i]>i-left)
				{
					
				}
				else
				{
					if(i-left%2==0)
					{
						ret+=(1+(i-left))*((i-left)/2)-(i-left);
					}
					else
					{
						ret+=(1+(i-left))*((i-left)/2)-(i-left);
						ret+=((i-left)/2)+1;
					}
					left=i;
					
				}
			}
			if(left!=N-1)
			{
				if(N-left%2==0)
				{
					ret+=(1+(N-left))* ((N-left)/2)-(N-left);
				}
				else
				{
					ret+=(1+(N-left))*((N-left)/2)-(N-left);
					ret+=((N-left)/2)+1;
				}
			}
			ret+=(N);
			System.out.println(ret);
			
		}
	}

}
