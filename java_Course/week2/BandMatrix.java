public class BandMatrix {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int r = Integer.parseInt(args[1]);

        for(int i = 0; i< n ; i++){
            for(int j = 0; j< n; j++){
                if(Math.abs(i-j) <= r) System.out.print("* ");
                else{
                    System.out.print("0 ");
                } 
            }
            System.out.print('\n');
        }
    }
}
