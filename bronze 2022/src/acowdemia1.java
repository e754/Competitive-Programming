import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class acowdemia1 {

	static int[]arr;
	static int N;
	static int L;
	public static boolean test(int mid)
	{
		int h=0;
		int Lcounter=L;
		for(int i=0;i<N;i++) 
		{ 
			if(arr[i]>=mid)
			{
				h++;
			}
			else if(arr[i]+1==mid&&Lcounter>0)
			{
				Lcounter--;
				h++;
			}
		}
		if(h<mid)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		L = Integer.parseInt(st.nextToken());
		if(L>N)
		{
			L=N;
		}
		st = new StringTokenizer(br.readLine());
		arr=new int[N];
		int top=0;
		for(int i=0;i<N;i++)
		{
			arr[i]=Integer.parseInt(st.nextToken());
			top=Math.max(top,arr[i]);
		}
//		System.out.println(test(0,6));
		Arrays.sort(arr);
		int bot=0;
		int ret=0;
		
		while(top!=bot)
		{
			int mid=(bot+top)/2; 

//			System.out.println(bot+" "+top+" "+mid);	
			
			if(top==bot+1)
			{
				if(test(top))
				{
					ret=top;
					break;
				}
				else
				{
					ret=bot;
					break;
				}
			}
			if(test(mid))
			{
				bot=mid;
			}
			else
			{
				top=mid;
			}
			
		}
		System.out.println(ret);
	}

}
