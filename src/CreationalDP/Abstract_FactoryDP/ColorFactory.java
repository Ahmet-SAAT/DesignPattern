package CreationalDP.Abstract_FactoryDP;

public class ColorFactory extends AbstractFactory {


    @Override
    Color getColor(String color) {
        if (color == null) {
            return null;
        }
        if (color.equalsIgnoreCase("Kirmizi")) {
            return new Red();
        } else if (color.equalsIgnoreCase("Yesil")) {
            return new Green();
        } else if (color.equalsIgnoreCase("Mavi")) {
            return new Blue();
        }
        return null;
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}
