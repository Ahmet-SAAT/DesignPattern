package CreationalDP.FactoryDP;

public class ShapeFactory {

    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("Daire")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("Dikdortgen")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("Kare")) {
            return new Square();
        }
        return null;
    }


}
