public class EnumTest {
    enum TrafficLight {
        GREEN("go"), AMBER("slow"), RED("stop");
        
        private String message;
        TrafficLight(String message) {
            this.message = message;
        }
        
        public String getMessage() {
            return message;
        }
    }
    
    public static void main(String[] args) {
        System.out.println(TrafficLight.AMBER.getMessage().toUpperCase());
    }
}

