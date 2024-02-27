class Student {
    private String name;
    private int age;
    
  
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
  
    public Student(Student other) {
        this.name = other.name;
        this.age = other.age;
    }
    
    
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Copy_Constructor {
    public static void main(String[] args) {
      
        Student student1 = new Student("Abhi", 18);
        
     
        System.out.println("Details of student1:");
        student1.display();
        
        
        Student student2 = new Student(student1);
        
        
        System.out.println("\nDetails of student2 (copy of student1):");
        student2.display();
    }
}
