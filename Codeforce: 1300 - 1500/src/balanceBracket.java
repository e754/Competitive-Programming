import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class balanceBracket {

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
			char[] arr=st.nextToken().toCharArray();
			int ret=0;
			for(int i=0;i<N*2-1;i++)
			{
				if(arr[i]=='('&&arr[i+1]=='(')
				{
					ret++;
				}
			}
			System.out.println(ret+1);
		}
	}

}
