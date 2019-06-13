enum Flags {
    TRUE1, TRUE2, TRUE;
 
    Flags() {
        System.out.println("HELLO");
    }
}
 
public class EnumConstructorInvoke {
    public static void main(String[] args) {
        Flags f1 = Flags.TRUE;
        Flags f2 = Flags.TRUE1;
        Flags f3 = Flags.TRUE2;
    }
}
