import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class stuckonbricks {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		
		for(int count=0;count<T;count++)
		{
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			float slope=b/a;
			int ret=0;
			int x=0;
		
			for(int y=0;y<b;b++)
			{
				ret++;
				if(y%2==0) //even, no shift 
				{
					
					int shiftback=x/2;
					float start=x-(shiftback*2);
					float end=start+slope;
					if(end-start<2)
					{
						
					}
					
					ret+=(slope/2);
				}
				else //odd, shifted
				{
					
				}
				
			}
			
			
			
		}
		
		
	}

}
