package factoryMethod;

public class DataBaseLoggerFactory implements LoggerFactory {

    @Override
    public Logger creatLogger() {
        return new DataBaseLogger();
    }
}
