public class Person_13{
    private String name;
    private int age;
    private String address;


    public Person_13(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }


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

    public static void main(String[] args) {
        // Creating an instance of the Person class
        Person person = new Person("Abhi", 17, "Shapur, Junagadh");

        person.introduce();
    }
}
