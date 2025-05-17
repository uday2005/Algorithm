public class RandomWalkers {
    public static void main(String[] args) {
        
        int r = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int count = 0;
    for(int k = 0; k< n ; k++){
    int i = 0;
    int j = 0;
    
    while( (Math.abs(i) + Math.abs(j)) != r ){
        int value = (int) (Math.floor(Math.random()*4));
        if(value == 0){
            count++;
            i++;
        }
        else if(value ==1){
            count++;
            i--;
        }
        else if(value ==2){
            count++;
            j++;
        }
        else{
            count++;
            j--;
        }
    }
        }
        System.err.println("average number of steps = " + ((double)count / n));
    }
}
