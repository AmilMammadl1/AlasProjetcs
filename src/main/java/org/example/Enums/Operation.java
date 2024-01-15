package org.example.Enums;

public enum Operation {
    ADD {
        @Override
        public double calculate(double num1, double num2) {
            return num1 + num2;
        }
    }, SUBTRACT {
        @Override
        public double calculate(double num1, double num2) {
            return num1 - num2;
        }
    }, MULTIPLY {
        @Override
        public double calculate(double num1, double num2) {
            return num1 * num2;
        }
    }, DIVIDE {
        @Override
        public double calculate(double num1, double num2) {
            if (num2 != 0) {
                return num1 / num2;
            } else {
                return Double.NaN; // Not a Number indicating division by zero
            }
        }
    };
    public abstract double calculate(double num1, double num2);

}
