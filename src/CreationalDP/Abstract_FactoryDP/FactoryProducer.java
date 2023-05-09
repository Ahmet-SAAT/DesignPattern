package CreationalDP.Abstract_FactoryDP;

public class FactoryProducer {


    public static AbstractFactory getFactory(String choice){
        if (choice == null) {
            return null;
        }
        if (choice.equalsIgnoreCase("RENK")) {
            return new ColorFactory();
        } else if (choice.equalsIgnoreCase("SEKIL")) {
            return new ShapeFactory();
        }
        return null;
    }

}
