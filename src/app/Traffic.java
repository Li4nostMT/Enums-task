package app;

public class Traffic {

    Lights light;

    public static void main(String[] args) {

        Traffic road1 = new Traffic(Lights.RED);
        road1.getDirection();

    }
    public Traffic(Lights light) {
        this.light = light;
    }
    public void getDirection() {

        switch (light) {
            case RED -> System.out.println("STAND");
            case YELLOW -> System.out.println("GET READY");
            case GREEN -> System.out.println("DRIVE");
            default -> System.out.println("Error!");
        }
    }
}
