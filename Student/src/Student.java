public class Student {
    private String name;
    private String classes;

    public Student() {
        name = "John";
        classes = "C02";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public class Test {
        public static void main(String[] args) {
            Student student = new Student();
            student.setName("Alice");
            student.setClasses("C03");
        }
    }
}

