import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class shoeshuffling {
	public static int[]rotate(int[]ret,int c,int d)
	{
//		System.out.println(c+" "+d);
		
		for(int i=c+1;i<d+1;i++)
		{
//			System.out.println("shifited "+i);
			 ret[i]=i;
		}
		ret[c]=d+1;
		return ret;
		
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		
		for(int i=0;i<T;i++)
		{
			st = new StringTokenizer(br.readLine());
			int N=Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			int[]input=new int[N];
			int ret[]=new int[N];
			int start=0;
			int currnum=-1;
			int count=2;
			boolean valid=true;
			if(N==1)
			{
				valid=false;
			}
			for(int j=0;j<N;j++)
			{
				ret[j]=j+1;
				input[j]=Integer.parseInt(st.nextToken());
				if(input[j]==currnum)
				{
					count++;
				}
				else
				{
					if(count>1)
					{
						if(j!=0)
						{
							ret=rotate(ret,start,j-1);
						}
						start=j;
						count=1;
						currnum=input[j];
					}
					else
					{
						valid=false;
					}
				}
			}
			if(count==1)
			{
				valid=false;
			}
			ret=rotate(ret,start,N-1);

			if(valid)
			{
				System.out.println(ret[0]+" ");
				for(int j=1;j<N;j++)
				{
					System.out.print(ret[j]+" ");
				}
			}
			else
			{
				System.out.println(-1);
			}
			
		}
	}

}
