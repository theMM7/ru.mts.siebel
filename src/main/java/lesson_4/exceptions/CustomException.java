package lesson_4.exceptions;

public class CustomException extends RuntimeException {
    private static final String ERROR_MESSAGE = "Произошла критическая ошибка";
    public CustomException() {
        super(ERROR_MESSAGE);
    }

    public CustomException(String message, Throwable cause) {
        super(message, cause);
    }
}
