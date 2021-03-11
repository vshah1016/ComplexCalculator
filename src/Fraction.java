public class Fraction implements Number{
    public final int numerator;
    public final int denominator;

    public Fraction(int numerator, int denominator) {
        int gcd = gcd(numerator, denominator);
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
        assert(denominator != 0);
    }

    @Override
    public Number add(Number num) {
        return null;
//        return new Fraction();
    }

    @Override
    public Number subtract(Number num) {
        return null;
    }

    @Override
    public Number multiply(Number num) {
        return null;
    }

    @Override
    public Number divide(Number num) {
        return null;
    }

    @Override
    public String toString() {
        return denominator == 1 ? numerator + "" : numerator + "/" + denominator;
    }

    private int gcd(int numerator, int denominator){
        int gcd = 0;
        for(int i = 1; i <= numerator && i <= denominator; i++) {
            if(numerator % i == 0 && denominator % i == 0)
                gcd = i;
        }
        return gcd;
    }
}
