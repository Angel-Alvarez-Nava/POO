package operaciones;

public class Division extends Operacion {
        public double calcular(double a, double b) {
            if (b != 0) return a / b;
            throw new ArithmeticException("Error: División por cero");
        }
    }

