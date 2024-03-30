import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class mountainClimbEasy {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		
		int currLeng=0;
		int prev=0;
		int ret=0;
		for(int i=0;i<N;i++)
		{
			int a=Integer.parseInt(st.nextToken());
			if(a>prev)
			{
				
				currLeng++;
				prev=a;
			}
			else
			{
				prev=a;
				if(currLeng>=3)
				{
					ret++;
				}
				currLeng=1;
				
			}
		}
		
		if(currLeng>=3)
		{
			ret++;
		}
		System.out.println(ret);
	}

}
