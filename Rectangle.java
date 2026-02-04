class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double w, double h) {
        width = w;
        height = h;
    }

    @Override
    double getArea()
    {
        return width * height;
    }
}