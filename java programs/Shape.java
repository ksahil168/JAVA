abstract class Shape {
    protected double length;
    protected double breadth;
    protected double height;

    public Shape(double length, double breadth, double height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public abstract double volume();

    public abstract double surfaceArea();
}

class Cube extends Shape {
    public Cube(double side) {
        super(side, side, side);
    }

    @Override
    public double volume() {
        return length * length * length;
    }

    @Override
    public double surfaceArea() {
        return 6 * length * length;
    }
}

class Cylinder extends Shape {
    public Cylinder(double radius, double height) {
        super(radius, radius, height);
    }

    @Override
    public double volume() {
        return Math.PI * length * length * height;
    }

    @Override
    public double surfaceArea() {
        return 2 * Math.PI * length * (length + height);
    }
}

class Cuboid extends Shape {
    public Cuboid(double length, double breadth, double height) {
        super(length, breadth, height);
    }

    @Override
    public double volume() {
        return length * breadth * height;
    }

    @Override
    public double surfaceArea() {
        return 2 * (length * breadth + breadth * height + height * length);
    }

    public static void main(String[] args) {
        Cube cube = new Cube(5);
        System.out.println("Cube Volume: " + cube.volume());
        System.out.println("Cube Surface Area: " + cube.surfaceArea());

        Cylinder cylinder = new Cylinder(3, 7);
        System.out.println("Cylinder Volume: " + cylinder.volume());
        System.out.println("Cylinder Surface Area: " + cylinder.surfaceArea());

        Cuboid cuboid = new Cuboid(4, 6, 8);
        System.out.println("Cuboid Volume: " + cuboid.volume());
        System.out.println("Cuboid Surface Area: " + cuboid.surfaceArea());
    }
}
