package by.silebin.lab1.exception;

public class TransportNotFoundException extends RuntimeException {
    public TransportNotFoundException() {
        super();
    }

    public TransportNotFoundException(String message) {
        super(message);
    }

    public TransportNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public TransportNotFoundException(Throwable cause) {
        super(cause);
    }

    protected TransportNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
