package SuperFactory;

import AbstractFactory.TechAbstractFactory;
import LevelFactory.AdvancedFactory;
import LevelFactory.BasicFactory;
import Type.Level;

//SUPER FACTORY
public class TechFactory {

    private TechFactory() {

    }
    public static TechAbstractFactory getFactory(Level level) {
        switch (level) {
            case BASIC:
                return new BasicFactory();
            case ADVANCED:
                return new AdvancedFactory();
            default:
                throw new UnsupportedOperationException("This level is unsupported ");
        }
    }
}