import AbstractFactory.TechAbstractFactory;
import AbstractProduct.BE.BackEnd;
import AbstractProduct.FE.FrontEnd;
import SuperFactory.TechFactory;
import Type.Level;

public class Client {
 
    public static void main(String[] args) {
 
        TechAbstractFactory factory = TechFactory.getFactory(Level.ADVANCED);
 
        FrontEnd frontEnd = factory.educateFE();
        frontEnd.educate();
 
        BackEnd backEnd = factory.educateBE();
        backEnd.educate();
    }
}