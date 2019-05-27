@FunctionalInterface
interface I5 {
    void print();
}
 
public class LambdaInitialize {
    int i = 100;
    
    I5 obj1 = new I5() {
        int i = 200;
        public void print() {
            System.out.println(this.i);
        }
    };
    
    I5 obj2 = () -> {
        int i = 300;
        System.out.println(this.i);
    };
    
    public static void main(String[] args) {
        LambdaInitialize ques = new LambdaInitialize();
        ques.obj1.print();
        ques.obj2.print();
    }
}

