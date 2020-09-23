package Task5p1;

import Task5p1.Loggers.CustomLogger;

public class Calculator {
    private CustomLogger logger;

    public Calculator(LoggerType loggerType) {
        this.logger = LoggerFactory.getLogger(loggerType);
    }

    public double addition(double operand1, double operand2) {
        double result = operand1 + operand2;
        logger.log("addition result is " + result);
        return result;
    }

    public double subtraction(double operand1, double operand2) {
        double result = operand1 - operand2;
        logger.log("subtraction result is " + result);
        return result;
    }

    public double multiplication(double operand1, double operand2) {
        double result = operand1 * operand2;
        logger.log("multiplication result is " + result);
        return result;
    }

    public double division(double operand1, double operand2) {
        double result = operand1 / operand2;
        logger.log("division result is " + result);
        return result;
    }
}
