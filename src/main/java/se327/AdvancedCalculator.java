package se327;

public class AdvancedCalculator extends Calculator{
    public double power(double base, double exponent){
        return Math.pow(base, exponent);
    }
    public double sqrt(int a) throws IllegalArgumentException{
        if(a<0){
            throw new IllegalArgumentException("Cannot calculate square root of negative numbers");
        }
        return Math.sqrt(a);
    }
}
