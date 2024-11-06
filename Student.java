public class Student {

    private String name;
    private int age; 
    
    public Student() {
        name = "Unknown";
        age = 0;
    }
    
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void showDetails() {
        System.out.println("Student's Name: " + name);
        System.out.println("Student's Age: " + age);
    }

    public static void main(String[] args) {
        Student joshua = new Student("Joshua Grejalvo", 22);
        joshua.showDetails();
    }
}