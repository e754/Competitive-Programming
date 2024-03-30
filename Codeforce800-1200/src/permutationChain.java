import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class permutationChain {
	public static void printArray(int []toprint)
	{
		for(int a:toprint)
		{
			System.out.print((a+1)+" ");
		}
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
        	System.out.println(N);
        	int premutation[]=new int[N];
        	LinkedList<Integer> removable = new LinkedList<Integer>(); 
        	for(int j=0;j<N;j++)
        	{
        		premutation[j]=j;
        		removable.add(j);
        	}
        	printArray(premutation);
        	System.out.println();
        	premutation[0]=1;
        	premutation[1]=0;
        	removable.remove();
        	removable.remove();
        	printArray(premutation);
        	while(!removable.isEmpty())
        	{
        		System.out.println();
        		int toChange=removable.pop();
        		for(int j=0;j<N;j++)
        		{
        			if(premutation[j]!=j&&premutation[j]!=toChange)
        			{
        				int a=premutation[toChange];
        				premutation[toChange]=premutation[j];
        				premutation[j]=a;
        				printArray(premutation);
        				break;
        			}
        		}
        	}
        }
	}

}
