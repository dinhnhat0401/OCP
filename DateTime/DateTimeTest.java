import java.time.*;

public class DateTimeTest {
  public static void main(String[] args) {
    LocalDate date1 = LocalDate.of(2019, 1, 1);
    //Duration d = Duration.ofDays(1);
    Period d = Period.ofDays(1);
    System.out.println(date1.plus(d));
  }
}

