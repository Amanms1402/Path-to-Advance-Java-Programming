public class Bicycle {
    private String brand;
    
    public Bicycle(String brand) { //constru.
        this.brand = brand;
    }

    public void printBrand() { //print val
        System.out.println("The bicycle brand is: " + brand);
    }

    public static void main(String[] args) {
        Bicycle myBicycle = new Bicycle("Hercules");
        myBicycle.printBrand();
    }
}