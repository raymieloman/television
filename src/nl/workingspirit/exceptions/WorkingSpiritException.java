package nl.workingspirit.exceptions;

// checked exception want erft direct! van Exception
public class WorkingSpiritException extends Exception {
    public WorkingSpiritException(String message) {
        super(message);
    }
}
