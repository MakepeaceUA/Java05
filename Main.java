public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];

        shapes[0] = new Rectangle(5, 10);
        shapes[1] = new Circle(7);
        shapes[2] = new RightTriangle(4, 6);
        shapes[3] = new Trapezoid(8, 12, 5);

        for (Shape shape : shapes)
        {
            System.out.println("Площадь " + shape.getClass().getSimpleName() + ": " + shape.getArea());
        }
    }
}