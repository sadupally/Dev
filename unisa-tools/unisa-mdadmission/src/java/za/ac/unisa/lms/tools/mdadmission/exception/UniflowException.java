package za.ac.unisa.lms.tools.mdadmission.exception;

import java.io.IOException;

public class UniflowException extends IOException {
 
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message = null;
 
    public UniflowException() {
        super();
    }
 
    public UniflowException(String message, Throwable t) {
        super( message, t);
        this.message = message;
    }
    
    public UniflowException(String message) {
        super(message);
        this.message = message;
    }
 
    public UniflowException(Throwable cause) {
        super(cause);
    }

    @Override
    public String getMessage() {
        return message;
    }
}