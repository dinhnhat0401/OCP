import java.io.Console;
import java.util.Optional;

public class CheckSystemConsole {
  public static void main(String [] args) {
    Optional<Console> optional = Optional.ofNullable(System.console());
    if (optional.isPresent()) {
      System.out.println(optional.get());
    }
  }
}

