package model;

public class CalculadoraModel {
    private double resultado;

    public void calcular(String operacao, double a, double b) {
        switch (operacao) {
            case "+": resultado = a + b; break;
            case "-": resultado = a - b; break;
            case "*": resultado = a * b; break;
            case "/": 
                if (b != 0) resultado = a / b;
                else throw new ArithmeticException("Não é possível dividir por zero");
                break;
            default: throw new IllegalArgumentException("Operação inválida");
        }
    }

    public double getResultado() { return resultado; }
}
