import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class smallestMultiple {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		for(int count=0;count<T;count++)
		{
			st = new StringTokenizer(br.readLine());
			int N=Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			char input[]=st.nextToken().toCharArray();
			long ret=0;
			for(int i=1;i<N+1;i++)
			{
				for(int curr=i;curr<N+1;curr+=i)
				{
					if(input[curr-1]=='1')
					{
						break;
					}
					
					
					if(input[curr-1]==('0'))
					{
//						System.out.println(i);
						input[curr-1]='a';
						ret+=i;
					}
				}
			}
			System.out.println(ret);
		}
	}

}
