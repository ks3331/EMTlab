package mk.ukim.finki.emt.lab1.model.exceptions;

public class InvalidUserCredentialsException extends RuntimeException {
  public InvalidUserCredentialsException() {
    super("Invalid user credentials exception");
  }

}
