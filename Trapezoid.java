class Trapezoid extends Shape {
    private double base1;
    private double base2;
    private double height;

    public Trapezoid(double b1, double b2, double h)
    {
        base1 = b1;
        base2 = b2;
        height = h;
    }

    @Override
    double getArea()
    {
        return 0.5 * (base1 + base2) * height;
    }
}