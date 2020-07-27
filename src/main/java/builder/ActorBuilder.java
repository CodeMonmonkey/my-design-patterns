package builder;

abstract class ActorBuilder {

    protected Actor actor;

    public abstract void buildType();

    public abstract void buildSex();

    public abstract void buildFace();

    public abstract void buildCostume();

    public abstract void buildHairstyle();

    public Actor creatActor() {
        return actor;
    }

}
