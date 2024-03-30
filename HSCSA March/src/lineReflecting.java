import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class lineReflecting {
	public static int reflect(int a,int b)
	{
		return b+(b-a);
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int X=Integer.parseInt(st.nextToken());
		int Y=Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int[]xshift=new int[N];
		for(int i=0;i<N;i++)
		{
			xshift[i]=Integer.parseInt(st.nextToken())-X;
		}
		st = new StringTokenizer(br.readLine());
		int[]yshift=new int[N];
		for(int i=0;i<N;i++)
		{
			yshift[i]=Integer.parseInt(st.nextToken())-Y;
		}
		
		Arrays.sort(xshift);
		Arrays.sort(yshift);
		int lowcounter=0;
		int highcounter=N-1;
		int curr=0;
		while(lowcounter!=highcounter)
		{
			
		}
		
		
	}

}
