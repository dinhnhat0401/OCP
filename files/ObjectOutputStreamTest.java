import java.io.*;
 
class Counter implements Serializable {
    private static int count = 0;
    public Counter() {
        count++;
    }
 
    public static int getCount() {
        return count;
    }
}
 
public class ObjectOutputStreamTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Counter ctr = new Counter();
        File f = new File("Counter.txt");
        FileOutputStream fos = new FileOutputStream();
        try( ObjectOutputStream oos = new ObjectOutputStream(fos )){
            oos.writeObject(ctr);
        }
 
        new Counter(); new Counter();
 
        try( ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Counter.dat")) ){
            ctr = (Counter)ois.readObject();
            System.out.println(Counter.getCount());
        }
    }
}

