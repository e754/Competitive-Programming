import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class gettingZero {
	static int[] dp=new int[32768];
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++)
		{
			int a=Integer.parseInt(st.nextToken());
			int ret=0;
			while(a*2<32768)
			{
				a*=2;
				ret++;
			}
			
		}
	}

}
