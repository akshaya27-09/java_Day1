public class Program4 {
    // Data attributes
    String name;
    int age;
    int rollNo;
    public Program4(String name, int age, int rollNo) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }
    public void display() {
        System.out.println("Student Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Roll Number: " + this.rollNo);
    }

    public static void main(String[] args) {
        Program4 student1 = new Program4("Alex Smith", 20, 101);
        student1.display();
    }
}
