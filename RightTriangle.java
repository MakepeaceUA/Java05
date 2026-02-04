class RightTriangle extends Shape {
    private double base;
    private double height;

    public RightTriangle(double b, double h)
    {
        base = b;
        height = h;
    }

    @Override
    double getArea()
    {
        return 0.5 * base * height;
    }
}