package BehavioralDP.MediatorDP;

public class MediatorRunner {
    void mediatorDemo(){

        //danisman objemi olusturuyorum.
        MessageDispatcher dispatcher=new MessageDispatcher();

        //actorlerimi olusturuyorum
        Actor actor1=new MessageActor("Actor 1",dispatcher);
        Actor actor2=new MessageActor("Actor 2",dispatcher);
        Actor actor3=new MessageActor("Actor 3",dispatcher);
        Actor actor4=new MessageActor("Actor 4",dispatcher);

        //dispatcher uzerinden hangi aktor hangi alanda uzman onu setliyoruz
        dispatcher.register("topic 1",actor1);
        dispatcher.register("topic 2",actor2);
        dispatcher.register("topic 3",actor3);
        dispatcher.register("topic 4",actor4);

        //actorlerin sordugu sorular
        actor1.sendMessage("topic 2","Message for Topic-2");
        actor1.sendMessage("topic 3","Message for Topic-3");
        actor1.sendMessage("topic 4","Message for Topic-4");
        actor1.sendMessage("topic 1","Message for Topic-1");
        actor1.sendMessage("topic 5","Message for Topic-5");


    }


    public static void main(String[] args) {

       MediatorRunner md=new MediatorRunner();
       md.mediatorDemo();

    }
}
