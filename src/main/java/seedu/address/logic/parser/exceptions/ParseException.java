package seedu.address.logic.parser.exceptions;

import seedu.address.commons.exceptions.IllegalValueException;

/**
 * Represents a parse error encountered by a parser.
 */
public class ParseException extends IllegalValueException {

    public ParseException(String message) {
        super(message);
    }

    /**
     * Parse Exception which include cause of exception with error message.
     * @param message The message to be passed
     * @param cause The cause of the exception
     */
    public ParseException(String message, Throwable cause) {
        super(message + "\nCause: " + cause.getMessage(), cause);
    }
}
