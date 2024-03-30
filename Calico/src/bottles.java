import java.io.*;
import java.util.Arrays;

class bottles {
    /**
    * Output the minimum total wait time on the first line.
    * Output the optimal new permutation on the second line.
    * 
    * N: the number of students in line
    * C: the list of the bottle capacities, in liters, for each student
    */
	static class edge implements Comparable<edge>
	{
		int i,v;
		public edge(int i,int v) {this.i=i;this.v=v;}
		public int compareTo(edge o) {return v-o.v;}
	}
    static void solve (int N, int[] C) {
        // YOUR CODE HERE
    	edge[] arr=new edge[C.length];
    	for(int i=0;i<C.length;i++)
    	{
    		arr[i]=new edge(i,C[i]);
    	}
    	Arrays.sort(arr);
    	int t=0;
    	for(int i=0;i<C.length;i++)
    	{
    		t+=(N-i)*arr[i].v;
    	}
    	out.println(t);
    	for(int i=0;i<C.length-1;i++)
    	{
    		out.print((arr[i].i+1)+" ");
    	}
    	out.println((arr[C.length-1].i)+1);
    }
    
    static BufferedReader in = new BufferedReader(
        new InputStreamReader(System.in)
    );
    static PrintWriter out = new PrintWriter(System.out);

    public static void main (String[] args) throws IOException {
        int T = Integer.parseInt(in.readLine());
        for (int i = 0; i < T; ++i) {
            int N = Integer.parseInt(in.readLine());
            String[] Cs = in.readLine().split(" ");
            int[] C = new int[N];
            for (int j = 0; j < N; ++j) C[j] = Integer.parseInt(Cs[j]);
            solve(N, C);
        }
        out.flush();
    }
}