public class CMYKtoRGB {
    public static void main(String[] args){
        double c = Double.parseDouble(args[0]);
        double m = Double.parseDouble(args[1]);
        double y = Double.parseDouble(args[2]);
        double k = Double.parseDouble(args[3]);

        double w = 1- k;
        int red = ((int) (255 * (1-c) * w));
        int  green = ((int) (255 * (1-m) * w));
        int blue = ((int)(255 * (1-y) * w));

        System.out.println("red  = " + red);
        System.out.println("green  = " + green);
        System.out.println("blue  = " + blue);
    }
}
