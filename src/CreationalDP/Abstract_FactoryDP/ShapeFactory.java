package CreationalDP.Abstract_FactoryDP;

public class ShapeFactory extends AbstractFactory {


    @Override
    Color getColor(String color) {
        return null;
    }

    @Override
    Shape getShape(String shape) {
        if (shape == null) {
            return null;
        }
        if (shape.equalsIgnoreCase("Daire")) {
            return new Circle();
        } else if (shape.equalsIgnoreCase("Dikdortgen")) {
            return new Rectangle();
        } else if (shape.equalsIgnoreCase("Kare")) {
            return new Square();
        }
        return null;
    }
}
