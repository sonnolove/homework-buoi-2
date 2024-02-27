public class Circle extends Shape {
    protected double radius = 1.0;

    public Circle() {
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return radius*radius*Math.PI;
    }

    @Override
    double getPeremeter() {
        // TODO Auto-generated method stub
        return radius*2*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle ["+super.toString()+"radius=" + radius + "]";
    }

    
}
