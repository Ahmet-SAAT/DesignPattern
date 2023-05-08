package CreationaDP.SingletonDP;

public class SingletonObject {

    String message="Merhaba";

   private SingletonObject(){};//yeni bir new yapmamiza engel oluyor.Obje istiyorsn getinstance ile
    //olusturdugum objeyi al diyor.

   private static  SingletonObject instance=new SingletonObject();

   public static SingletonObject getinstance(){
       return instance;
   }


   public void changeMessage(){
       this.message=this.message+"Batch130-131";
       System.out.println(this.message);
   }
}
