import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        String wordf = null;
        int i = 1;
        while(!StdIn.isEmpty()){
        String word= StdIn.readString();
        double p= 1.0/i;

        boolean prob = StdRandom.bernoulli(p);
        if(prob){
            wordf = word;
        }
            i++;
        }
        StdOut.println(wordf);
    }
}
