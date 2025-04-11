package spring.frontend_backend.utils.exceptions;

public class DataNotFoundException extends RuntimeException {
  public DataNotFoundException(String questionNotFound) {
    super(questionNotFound);
  }
}
