package _04_builder;

/**
 * 游戏角色的控制器，指挥者，逐步构建复杂产品对象
 */
public class ActorController {

    public Actor construct(ActorBuilder actorBuilder) {
        Actor actor;
        actorBuilder.buildType();
        actorBuilder.buildSex();
        actorBuilder.buildFace();
        actorBuilder.buildCostume();
        actorBuilder.buildHairstyle();
        actor = actorBuilder.creatActor();
        return actor;
    }
}
