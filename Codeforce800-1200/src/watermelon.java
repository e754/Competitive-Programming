import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class watermelon {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		if(N==2)
		{
			System.out.println("NO");
		}
		else if(N%2==0)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}

	}

}
