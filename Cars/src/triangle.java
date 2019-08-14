public class triangle {


    private double sideOne;
    private double sideTwo;

    public triangle(double a, double b) {
        this.sideOne = a;
        this.sideTwo = b;
    }


    public double formula(double a, double b) {

        double result = 0;

        result = Math.pow(a, 2) + Math.pow(b, 2);

        return Math.sqrt(result);
    }

}
