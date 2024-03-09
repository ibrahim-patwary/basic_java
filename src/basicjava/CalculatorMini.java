package basicjava;
 
public class CalculatorMini {

    public double number, number1, result;

    double summation(double n, double n1) {
        number = n;
        number1 = n1;
        result = (number + number1);
        return result;
    }

    double Subtraction(double n, double n1) {
        number = n;
        number1 = n1;
        result =( number - number1);
        return result;
    }

    double Multiplication(double n, double n1) {
        number = n;
        number1 = n1;
        result = (number * number1);
        return result;
    }

    double Division(double n, double n1) {
        number = n;
        number1 = n1;
        result = (number / number1);
        return result;
    }
}
