package CreationalDP.FactoryDP;

public class FactoryPatternDemo {
    public static void main(String[] args) {

        /*Circle circle= new Circle();
        circle.draw();

        Square square = new Square();
        square.draw();

        Rectangle rectangle = new Rectangle();
        rectangle.draw();*/


//Factorypattern= domain bilgisi olmadan istenilen obje olusturulur

        ShapeFactory shapeFactory=new ShapeFactory();//tek newleme

        Shape shape1=shapeFactory.getShape("Daire");//classin adini bilmeme bile gerek yok
        shape1.draw();


        Shape shape2=shapeFactory.getShape("Dikdortgen");
        shape2.draw();

        Shape shape3=shapeFactory.getShape("Kare");
        shape3.draw();

    }
}
