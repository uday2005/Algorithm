public class GreatCircle {
    public static void main(String[] args){
        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);

        x1 = Math.toRadians(x1);
        y1 = Math.toRadians(y1);
        x2 = Math.toRadians(x2);
        y2 = Math.toRadians(y2);


        int r = 6371;

        double term1 = Math.sin((x2 - x1)/2.0) * Math.sin((x2 - x1)/2.0);
        double term2 = Math.cos(x1) * Math.cos(x2) *  Math.sin((y2 - y1)/2.0) * Math.sin((y2 - y1)/2.0);

        double term3 = Math.sqrt(term1 + term2);
        double term4 = Math.asin(term3);

        double last = 2 * r * term4;

        System.out.println(last + " kilometers");
    }
}
