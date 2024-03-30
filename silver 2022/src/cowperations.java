import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class cowperations {


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		char[] arr = st.nextToken().toCharArray();
		char first='A';
		char second='A';
		st = new StringTokenizer(br.readLine());
		int Q = Integer.parseInt(st.nextToken());
		int[] Cpsum=new int[arr.length+1];
		int[] Opsum=new int[arr.length+1];
		int[] Wpsum=new int[arr.length+1];
		for(int i=1;i<arr.length+1;i++)
		{
			Cpsum[i]=Cpsum[i-1];
			Opsum[i]=Opsum[i-1];
			Wpsum[i]=Wpsum[i-1];
			if(arr[i-1]=='C')
				Cpsum[i]++;
			else if(arr[i-1]=='O')
				Opsum[i]++;
			else
				Wpsum[i]++;
		}
		for(int a=0;a<Q;a++)
		{
			st = new StringTokenizer(br.readLine());
			int l=Integer.parseInt(st.nextToken())-1;
			int r=Integer.parseInt(st.nextToken());
			int Csum=(Cpsum[r]-Cpsum[l])%2;
			int Osum=(Opsum[r]-Opsum[l])%2;
			int Wsum=(Wpsum[r]-Wpsum[l])%2;
			if(Csum==0)
			{
				if(Osum+Wsum==2)
				{
					System.out.print('Y');
				}
				else
				{
					System.out.print('N');
				}
			}
			else
			{
				if(Osum+Wsum==0)
				{
					System.out.print('Y');
				}
				else
				{
					System.out.print('N');
				}
			}
			
		}

		
		
	}

}
