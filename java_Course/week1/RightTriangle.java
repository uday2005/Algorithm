public class RightTriangle {
    public static void main(String[] args){
        boolean RightTr;

        // int n1 = Integer.parseInt(args[0]);
        // int n2 = Integer.parseInt(args[1]);
        // int n3 = Integer.parseInt(args[2]);

        // This will overflow the integer in the case of the big integer so we can long instead

        Long n1 = Long.parseLong(args[0]);
        Long n2 = Long.parseLong(args[1]);
        Long n3 = Long.parseLong(args[2]);
        // Check for right angle triangle by  pythagoras theorem
        RightTr = (
                (
                        ((n1 * n1) == (n2 * n2) + (n3 * n3))
                ||
                         ((n2 * n2) == (n1 * n1) + (n3 * n3))
                ||
                        ((n3 * n3) == (n1 * n1) + (n2 * n2))
                ) && (n1 > 0 && n2>0 && n3>0));


        System.out.println(RightTr);


    }
}
