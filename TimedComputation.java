

public class TimedComputation{
    public static void main(String[] args) {
        long startTime;
        long endTime;
        double time;

        startTime=System.currentTimeMillis();
        double width, height, hypo;
        width=42.0;
        height=31.0;
        hypo=Math.sqrt(width*width+height*height);
        System.out.println("A triangle sides " +width+ " and "+height+" has hypoteneus " +hypo);
        System.out.println("\n mathematically sin(x)*sin(x) + cos(x)*cos(x) -1 should be zero ");
        System.out.println("lets check this for x=1 ");
        System.out.println("sin(1)*sin(1) + cos(1)*cos(1) - 1 is ");
        System.out.println(Math.sin(1)*Math.sin(1)+Math.cos(1)*Math.cos(1) -1);
        System.out.println("there can be roundoff error when calculating");
        Double x;
        x=Math.random();
        System.out.println(x);
        endTime = System.currentTimeMillis();
        time = (endTime - startTime)/1000.0;
        System.out.println("\n run time in second was " + time);


    }
}