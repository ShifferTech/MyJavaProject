package MyJavaProject;

public class JavaProject {
    private String name;
    public String color;
    public int ram;
    public String rom;
    public String os;
    public float price;

    // Constructors, getters, and setters can be added as needed

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void powerOn() {
        // Implementation for powering on the laptop
        System.out.println("Laptop is powered on.");
    }

    public void hibernate() {
        // Implementation for hibernating the laptop
        System.out.println("Laptop is hibernating.");
    }

    public void powerOff() {
        // Implementation for powering off the laptop
        System.out.println("Laptop is powered off.");
    }
}
