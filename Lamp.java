public class Lamp {
    private String brand;
    private boolean isLightOn;

    public Lamp(String brand) {
        this.brand = brand;
        this.isLightOn = false;
    }

    public void turnOn() {
        isLightOn = true;
        System.out.println(brand + "ON");
    }

    public void turnOff() {
        isLightOn = false;
        System.out.println(brand + "OFF");
    }

    public boolean isLightOn() {
        return isLightOn;
    }

    public static void main(String[] args) {

        Lamp myLamp = new Lamp("Archies Lamps");
        System.out.println("Is the lamp initially ON? " + myLamp.isLightOn());
        myLamp.turnOn();
        System.out.println("Is the lamp ON? " + myLamp.isLightOn());
        myLamp.turnOff();
        System.out.println("Is the lamp ON? " + myLamp.isLightOn());
    }
}