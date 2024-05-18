package factoryPattern;

public class Main {
    public static void main(String[] args) {
        // Factory design pattern
        ShapeFactory shapeFactoryObj = new ShapeFactory();
        Shape shapeObj = shapeFactoryObj.getShape("RECTANGLE");
        shapeObj.draw();
    }
}
