package CreationalDP.Abstract_FactoryDP;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {

        AbstractFactory shapeFactory = FactoryProducer.getFactory("Sekil");
        Shape shape1=shapeFactory.getShape("Daire");
        shape1.draw();
        Shape shape2=shapeFactory.getShape("Kare");
        shape2.draw();

        AbstractFactory colorFactory=FactoryProducer.getFactory("Renk");
        Color color1=colorFactory.getColor("Kirmizi");
        color1.fil();
        Color color2=colorFactory.getColor("Yesil");
        color2.fil();

        FactoryProducer.getFactory("Renk").getColor("Mavi").fil();


    }
}
