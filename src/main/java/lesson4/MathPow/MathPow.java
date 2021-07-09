package lesson4.MathPow;

import static java.lang.Math.abs;

public class MathPow {


    public double Pow(double a, double pow){

        double result = 1;

        if (a == 0) {
            return 0;
        }
        if (pow == 0) {
            return 1;
        }

        if (pow < 0) {

            for (int i =1; i <= abs(pow); i++) {
                result = (result * a);

            }
            result = 1/result;
        }

        for (int i =1; i <= pow; i++) {
            result = result * a;
        }
        return result;
    }

    public double recPow(double a, double pow){

        if (pow == 0){
            return 1;
        }

        if (a == 0){
            return 0;
        }

        if (pow > 0) {
            return a*recPow(a, pow-1);
        }

        return  1/(a*recPow(a, -1*(pow+1)));

    }
}
