package Circle;

public class NumberUtils {
    public static double randomradius() {
        double num = (double) (Math.random()*1000);
        return( 1.0 + num);
    }
    public static double randomdiameter(){
        double num = (double)(Math.random()*1000);
        return(1.0 + num);
    }
    public static String randomcirclename(){
        int num=(int)(Math.random()*1000);
        return("Circulo" + num);
    }
}
