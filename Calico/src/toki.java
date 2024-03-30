import java.io.*;
import java.util.HashSet;

class toki {
    /**
     * Determine if the word W follows the rules of toki pona phonotactics.
     * 
     * W: the word to check
     */
    static String solve(String W) {
    	boolean valid=true;
    	char a[]=W.toCharArray();
    	HashSet<Character> vowel = new HashSet<Character>();
    	vowel.add('a');vowel.add('e');vowel.add('i');vowel.add('o');vowel.add('u');
    	HashSet<Character> con = new HashSet<Character>();
    	con.add('m');con.add('n');con.add('p');con.add('t');con.add('k');con.add('s');con.add('w');con.add('j');con.add('l');
        
    	String next="C";
    	String prevState="N";
    	char prevChar;
    	String currState;
    	char prev='!';
    	for(char c:a)
    	{
    		
    		if(vowel.contains(c))
    		{
    			currState="V";
    		}
    		else if (con.contains(c))
    		{
    			currState="C";
    		}
    		else {
    			valid=false;
    			break;
    		}
    		
    		if(prev=='!')
    		{
    			prevState=currState;
    			prev=c;
    		}
    		else
    		{
    			if(prevState=="V")
    			{
    				if(!((c=='n')||(currState=="C")))
    				{
    					valid=false;
    					break;
    				}
    			}
    			else
    			{
    				if(!(currState=="V"))
    				{
//    					if(c=="u")
//    					{
//    						
//    					}
//    					else
//    					{
//    						
//    					}
    				}
    			}
    			
    		}
			prevState=currState;
			prev=c;
    		
    		
    	}
    	
    	return "pona";
    }
    
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(in.readLine());
        for (int i = 0; i < T; i++) {
            String W = in.readLine();
            out.println(solve(W));
        }
        out.flush();
    }
}
      