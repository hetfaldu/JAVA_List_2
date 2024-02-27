public class Person_11 {
    private String name;
    private int age;
    private String gender;



    public Person_11(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }


    public void introduce() 
    {
        System.out.println("Hello, my name is " + name + ". I am " + age + " years old and I am " + gender + ".");
    }

    public static void main(String[] args) {
        // Creating objects of the Person class
        Person person1 = new Person("Abhi", 17, "male");
        Person person2 = new Person("Het", 19, "male");

        person1.introduce();
        person2.introduce();
    }
}
