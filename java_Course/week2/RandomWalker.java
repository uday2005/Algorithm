public class RandomWalker {
    public static void main(String[] args) {

    int r = Integer.parseInt(args[0]);
    int i = 0;
    int j = 0;
    int count = 0;
    
    System.out.println("("+i + ", " + j+ ")");
    
    while( (Math.abs(i) + Math.abs(j)) != r ){
        int value = (int) (Math.floor(Math.random()*4));
        if(value == 0){
            count++;
            i++;
            System.out.println("("+i + ", " + j+ ")");
        }
        else if(value ==1){
            count++;
            i--;
            System.out.println("("+i + ", " + j+ ")");
        }
        else if(value ==2){
            count++;
            j++;
            System.out.println("("+i + ", " + j+ ")");
        }
        else{
            count++;
            j--;
            System.out.println("("+i + ", " + j+ ")");
        }
    }
    System.out.println("steps = " +count);
    }
}
