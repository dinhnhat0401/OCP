public class EnumTest {
    enum TrafficLight {
        GREEN("go"), AMBER("slow"), RED("stop");
        //RED, AMBER, GREEN;
        private String message;
        TrafficLight(String message) {
            this.message = message;
        }
        
        public String getMessage() {
            return message;
        }
    }
    
    public static void main(String[] args) {
        //System.out.println(TrafficLight.AMBER.getMessage().toUpperCase());
        TrafficLight tl = TrafficLight.valueOf(args[1]);
        switch(tl) {
          case RED:
            System.out.println("STOP");
            break;
          case AMBER:
            System.out.println("SLOW");
            break;
          case GREEN:
            System.out.println("GO");
            break;
        }
    }
}

