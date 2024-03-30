import java.io.*;

class template {
    /**
     * Return the minimum cost to convert all of the paint into a single color.
     * 
     * W: non-negative number of buckets of white paint
     * O: non-negative number of buckets of orange paint
     * B: non-negative number of buckets of brown paint
     * Cow: positive cost to convert between a bucket of orange and white paint
     * Cbo: positive cost to convert between a bucket of brown and orange paint
     * Cbw: positive cost to convert between a bucket of brown and white paint
     */
    static int solve(int W, int O, int B, int Cow, int Cbo, int Cbw) {
        
    	int minWO=Math.min(Cow, Cbw+Cbo);
    	int minBO=Math.min(Cbo, Cow+Cbw);
    	int minBW=Math.min(Cbw, Cow+Cbo);
    	int allW=O*minWO+B*minBW;
    	int allO=B*minBO+W*minWO;
    	int allB=O*minBO+W*minBW;
    	
        return Math.min(Math.min(allO, allB),allW);
    }
    
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(in.readLine());
        for (int i = 0; i < T; i++) {
            String[] line = in.readLine().split(" ");
            int W = Integer.parseInt(line[0]);
            int O = Integer.parseInt(line[1]);
            int B = Integer.parseInt(line[2]);
            int Cow = Integer.parseInt(line[3]);
            int Cbo = Integer.parseInt(line[4]);
            int Cbw = Integer.parseInt(line[5]);
            out.println(solve(W, O, B, Cow, Cbo, Cbw));
        }
        out.flush();
    }
}
