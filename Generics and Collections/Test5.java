import java.util.*;

class Test5 {
  public static <E extends Number> List<E> process(List<E> nums) {
    return nums;
  }
 
  public static void main(String [] args) {
    ArrayList<Integer> input = null;
    List<Integer> output = null;
    output = process(input);
  }
}

