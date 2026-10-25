public class Student {
    private String name;
    private int age;
    private int grade;

    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Grade: " + grade);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Nino", 19, 90);
        Student s2 = new Student("Giorgi", 20, 85);

        s1.displayInfo();
        s2.displayInfo();
    }
}
