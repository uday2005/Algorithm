public class GeneralizedHarmonic {
    public static void main(String[] args) {
        

        int n = Integer.parseInt(args[0]);
        int r = Integer.parseInt(args[1]);
        double sumf = 0.0;
        for(int i = 1; i<= n ; i++){
            int power = 1;
            for(int j = r ; j>=1; j--){
                power *= i;
            }
            sumf +=  1.0/power;
        }
         System.out.println(sumf);
    }
   
}
