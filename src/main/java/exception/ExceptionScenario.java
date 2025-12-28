package exception;

public class ExceptionScenario {

    // A simple method that throws an exception
    public void validateInput(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Negative numbers are not allowed.");
        }
    }
}
