class Person 
{
    String name;
    int age;
}


public class Object_as_parameter
 {
    public static void modifyPersonAge(Person person, int newAge) {
        person.age = newAge;
 }
    
    public static void main(String[] args) {
       
        Person person1 = new Person();
        person1.name = "Abhi";
        person1.age = 17;
        
        System.out.println("Initial age of " + person1.name + ": " + person1.age);
        
        modifyPersonAge(person1, 18);
        
        System.out.println("Updated age of " + person1.name + ": " + person1.age);
    }
}
