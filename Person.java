public class Person {
    // Attributes
    private String name;
    private int age;
    private String address;
    
    // Constructor
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    
    // Getter methods
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getAddress() {
        return address;
    }
    
    // Setter methods
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    // Method to introduce the person
    public void introduce() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
    
    // Main method for testing
    public static void main(String[] args) {
        // Create a Person object
        Person person = new Person("Abhi", 18, "Junagadh");
        
        // Display person's details
        person.introduce();
        
        // Update person's age and address
        person.setAge(17);
        person.setAddress("Shapur");
        
        // Display updated details
        person.introduce();
    }
}
