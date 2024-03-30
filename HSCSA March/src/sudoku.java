import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class sudoku {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b=Integer.parseInt(st.nextToken());
		int c=Integer.parseInt(st.nextToken());
		int d=Integer.parseInt(st.nextToken());
		
		System.out.println(a+" "+b+" "+c+" "+d);
		System.out.println(c+" "+d+" "+a+" "+b);
		System.out.println(b+" "+c+" "+d+" "+a);
		System.out.println(d+" "+a+" "+b+" "+c);
		
		
		
		
	}

}
