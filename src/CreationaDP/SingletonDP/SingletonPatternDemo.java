package CreationaDP.SingletonDP;

public class SingletonPatternDemo {
    public static void main(String[] args) {

        SingletonObject obj1=SingletonObject.getinstance();
        System.out.println(obj1.message);//Merhaba
        obj1.changeMessage();//MerhabaBatch130-131

        SingletonObject obj2=SingletonObject.getinstance();
        System.out.println(obj2.message);//MerhabaBatch130-131


    }
}
