class Circle extends Shape {
    private double radius;

    public Circle(double r)
    {
        radius = r;
    }

    @Override
    double getArea()
    {
        return Math.PI * radius * radius;
    }
}