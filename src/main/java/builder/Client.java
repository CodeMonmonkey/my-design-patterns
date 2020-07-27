package builder;

public class Client {

    public static void main(String[] args) {
        HeroBuilder heroBuilder = new HeroBuilder();
        ActorController actorController = new ActorController();
        Actor actor = actorController.construct(heroBuilder);

        System.out.println(actor.getType());
        System.out.println(actor.getFace());
        System.out.println(actor.getSex());
        System.out.println(actor.getCostume());
        System.out.println(actor.getHairstyle());
    }
}
