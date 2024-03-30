import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class mathmaticalCircus {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		for(int i=0;i<N;i++)
		{
			st = new StringTokenizer(br.readLine());
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			float m=(float)a/4;
			/*
if k==0 mod 4
      return no
else
if k==1 mod 4 OR k==3 mod 4
    i=0
    for i<ceiling(n/4)
       return (i+1, i+2)
       return (i+3, i+0)
if k==2 mod 4
    i=0
    for i<ceiling(n/4)
        return (i+2, i+1)
        return (i+3, i+0) 
        
YES
1 2
3 4
NO
YES
3 2
1 4
7 6
5 8
11 10
9 12

YES
1 2
3 4
5 6
7 8
9 10
11 12
13 14


YES
1 2
3 4
NO
YES
3 4
7 8
11 12
2 1
6 5
10 9
YES
1 2
3 4
5 6
7 8
9 10
11 12
13 14
			 */
			
			if(b%4==0)
			{
				System.out.println("NO");
			}
			else 
			{
				System.out.println("YES");
				if(b%4==1||b%4==3)
				{
					for(int j=1;j<a+1;j+=2)
					{
						System.out.println(j+" "+(j+1));
					}
				}
				else if(b%4==2)
				{
					if(a%4==0)
					{
						for(int j=1;j<a+1;j+=4)
						{
							System.out.println((j+1)+" "+(j));
							System.out.println((j+2)+" "+(j+3));
						}
					}
					else
					{
						for(int j=1;j<a-1;j+=4)
						{
							System.out.println((j+1)+" "+(j));
							System.out.println((j+2)+" "+(j+3));
						}
						System.out.println(a+" "+(a-1));
					}
				}
			}

			
		}
		

		
		
		
	}
}
