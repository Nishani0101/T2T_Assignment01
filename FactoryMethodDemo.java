interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle implements Shape {
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

class Square implements Shape {
    public void draw() {
        System.out.println("Drawing a Square");
    }
}

class ShapeFactory {
    // Factory method to create shapes
    public Shape getShape(String shapeType) {
        if (shapeType == null) return null;
        switch (shapeType.toLowerCase()) {
            case "circle": return new Circle();
            case "rectangle": return new Rectangle();
            case "square": return new Square();
            default: return null;
        }
    }
}

public class FactoryMethodDemo {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape circle = factory.getShape("circle");
        circle.draw();

        Shape rectangle = factory.getShape("rectangle");
        rectangle.draw();

        Shape square = factory.getShape("square");
        square.draw();
    }
}
