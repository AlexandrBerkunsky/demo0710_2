package exceptions;

import java.sql.SQLException;

public class CantFindCountryException extends RuntimeException {
    public CantFindCountryException(SQLException cause) {
        super(cause);
    }
}
