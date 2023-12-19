public class VongTron {
    public static void main(String[] args) {
        class Circle {
            private double radius;
            private String color;

            public Circle() {
                radius = 1.0;
                color = "red";
            }

            public Circle(double radius) {
                this.radius = radius;
                color = "red";
            }

            private double getRadius() {
                return radius;
            }

            private double getArea() {
                return Math.PI * radius * radius;
            }
        }

        public class TestCircle {
            public static void main(String[] args) {
                Circle circle = new Circle(2.0);

                // Truy cập đến phương thức getRadius() và getArea()
                System.out.println("Radius: " + circle.getRadius());
                System.out.println("Area: " + circle.getArea());
            }
        }
    }
}
