package irlasilva.javastudies.unittestsbasics.service;

public class CalculatorService {
    private double result;

    public CalculatorService() { this.result = 0; }

    public double getResult() { return  result; }

    public void sum(double value1, double value2) { result = value1 + value2; }

    public void sum(double value) { result += value; }
}
