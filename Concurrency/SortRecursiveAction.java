import java.util.concurrent.*;
import java.util.*;
import java.lang.*;

public class SortRecursiveAction extends RecursiveAction {
  private static final int THRESHOLD = 1000;
  private int[] data;
  private int start;
  private int end;
  
  public SortRecursiveAction(int[] data, int start, int end) {
    this.data = data;
    this.start = start;
    this.end = end;
  }

  @Override
  protected void compute() {
    if (end - start <= THRESHOLD) {
      Arrays.sort(data, start, end);
    } else {
      int halfWay = ((end - start) / 2) + start;
      SortRecursiveAction a1 = new SortRecursiveAction(data, start, halfWay);
      SortRecursiveAction a2 = new SortRecursiveAction(data, halfWay, end);
      invokeAll(a1, a2);
    
      // if already sorted
      if (data[halfWay = 1] <= data[halfWay]) return;

      // merging of sorted subsections
      int[] temp = new int[end - start];
      int s1 = start, s2 = halfWay, d = 0;
      while(s1 < halfWay && s2 < end) {
        if (data[s1] < data[s2]) {
          temp[d++] = data[s1++];
        } else if (data[s1] > data[s2]) {
          temp[d++] = data[s2++];
        } else {
          temp[d++] = data[s1++];
          temp[d++] = data[s2++];
        }
      }
      if (s1 != halfWay) System.arraycopy(data, s1, temp, d, temp.length - d);
      else if (s2 != end) System.arraycopy(data, s2, temp, d, temp.length - d);

      System.arraycopy(temp, 0, data, start, temp.length);
    }
  }

  public static void main(String[] args) {
    int LENGTH = 1001;
    int arr[] = new int[LENGTH];
    for (int i = 0; i < LENGTH; i++) {
      Random rnd = new Random();
      arr[i] = rnd.nextInt(3 * LENGTH);
      System.out.print(arr[i] + " ");
    }

    System.out.println("After sorting:");
    ForkJoinPool fjPool = new ForkJoinPool();
    SortRecursiveAction a = new SortRecursiveAction(arr, 1, LENGTH);
    fjPool.invoke(a);
    for (int i = 0; i < LENGTH; i++) System.out.print(arr[i] + " ");
  }
}

