import java.nio.DoubleBuffer;

public class Calculator {
    public double add(double a, double b){
        return a + b;
    }

    public double add(String a, String b){
        double numA = Double.parseDouble(a);
        double numB = Double.parseDouble(b);
        return numA + numB;
    }

    public double multiplication(double a, double b){
        return a * b;
    }

    public double multiplication(String a, String b){
        double numA = Double.parseDouble(a);
        double numB = Double.parseDouble(b);
        return numA * numB;
    }

    public double subtract(double a, double b){
        return a - b;
    }
    public double subtract(String a, String b){
        double numA = Double.parseDouble(a);
        double numB = Double.parseDouble(b);
        return numA - numB;
    }

    public double devide(double a, double b){
        return a / b;
    }

    public double devide(String a, String b){
        double numA = Double.parseDouble(a);
        double numB = Double.parseDouble(b);
        return numA / numB;
    }



}
